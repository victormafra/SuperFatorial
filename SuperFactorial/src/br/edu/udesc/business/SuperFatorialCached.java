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
public class SuperFatorialCached extends SuperFatorial {
	
    /**
     * Cache em memória para o super fatorial
     */
	private HashMap<Integer,BigInteger> cache = new HashMap<Integer, BigInteger>();
	private HashMap<Integer,BigInteger> superCache = new HashMap<Integer, BigInteger>();
    
        @Override
    public BigInteger getSuperFatorial( int numero ) throws ZeroEnteredException, NegativeValueEnteredException {

    	if( numero == 0 ) 
            throw new ZeroEnteredException();
        else if( numero < 0 ) 
            throw new NegativeValueEnteredException();
        // procura no cache primeiro se existir retorna o valor
        // se nao existir calcula e adiciona no cache
    	if ( superCache.containsKey( numero ) ) {
    		return superCache.get(numero);
        } else {
        	if(numero == 1){
        		superCache.put(1, BigInteger.valueOf(1));
        		return BigInteger.valueOf(1);
        	} 
        }
    	superCache.put(numero, getFatorial(numero).multiply(getSuperFatorial(numero - 1)));

    	return superCache.get(numero);
    }
    
        @Override
    protected BigInteger getFatorial( int numero ) {
        // procura no cache primeiro se existir retorna o valor
        // se nao existir calcula e adiciona no cache
    	if ( cache.containsKey( numero ) ) {
    		// cache.get(numero) = valor do fatorial
    		return cache.get(numero);
        } else {
        	if(numero == 1){
        		cache.put(1, BigInteger.valueOf(1));
        		return BigInteger.valueOf(1);
        	} 
        }
    	cache.put(numero, BigInteger.valueOf(numero).multiply(getFatorial(numero - 1)));
        return cache.get(numero);
    }

}