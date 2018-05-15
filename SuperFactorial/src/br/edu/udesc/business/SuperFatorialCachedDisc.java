package br.edu.udesc.business;

import java.math.BigInteger;
import java.util.HashMap;

import br.edu.udesc.exceptions.NegativeValueEnteredException;
import br.edu.udesc.exceptions.ZeroEnteredException;

/**
 * Antes de calcular o fatorial busca no cache
 * @author udesc
 *
 */
public class SuperFatorialCachedDisc extends SuperFatorial {
	
    /**
     * Cache em memória para o super fatorial
     */
	
        private FileManager file = new FileManager();
        private FileManager superFile = new FileManager();
        
        @Override
    public BigInteger getSuperFatorial( int numero ) throws ZeroEnteredException, NegativeValueEnteredException {

        
    	if( numero == 0 ) 
            throw new ZeroEnteredException();
        else if( numero < 0 ) 
            throw new NegativeValueEnteredException();
        // procura no cache primeiro se existir retorna o valor
        // se nao existir calcula e adiciona no cache
    	if (superFile.containsKey( numero, "Superfatorial.txt" ) ) {
    		return superFile.get(numero, "Superfatorial.txt");
        } else {
        	if(numero == 1){
        		superFile.put(1, BigInteger.valueOf(1), "Superfatorial.txt");
        		return BigInteger.valueOf(1);
        	} 
        }
    	superFile.put(numero, getFatorial(numero).multiply(getSuperFatorial(numero - 1)), "Superfatorial.txt");

    	return superFile.get(numero, "Superfatorial.txt");
    }
    
    protected BigInteger getFatorial( int numero ) {
        // procura no cache primeiro se existir retorna o valor
        // se nao existir calcula e adiciona no cache
    	if ( file.containsKey( numero, "fatorial.txt" ) ) {
    		// cache.get(numero) = valor do fatorial
    		return file.get(numero, "fatorial.txt");
        } else {
        	if(numero == 1){
        		file.put(1, BigInteger.valueOf(1), "fatorial.txt");
        		return BigInteger.valueOf(1);
        	} 
        }
    	file.put(numero, BigInteger.valueOf(numero).multiply(getFatorial(numero - 1)), "fatorial.txt");
        return file.get(numero, "fatorial.txt");
    }

}