package br.edu.udesc.business;

import java.math.BigInteger;

import br.edu.udesc.exceptions.InputException;
import br.edu.udesc.exceptions.NegativeValueEnteredException;
import br.edu.udesc.exceptions.ZeroEnteredException;

/**
 * Implementação do super fatorial
 * @author udesc
 *
 */
public class SuperFactorial implements ISuperFatorial {

    /**
     * 
     */
    public BigInteger getSuperFatorial(int numero)  throws InputException{
        if( numero == 0 ) 
            throw new ZeroEnteredException();
        else if( numero < 0 ) 
            throw new NegativeValueEnteredException();
        
        // TODO Auto-generated method stub
        //return getFatorial(numero);
        
        if(numero == 1){
        	return BigInteger.valueOf(1);
        }
        
    	return  getFatorial(numero).multiply(getSuperFatorial(numero - 1));
    }
    

    /**
     * versão recursiva do getFatorial
     * @param numero
     * @return
     */
    protected BigInteger getFatorial( int numero ) {
        if(numero == 1){
        	return BigInteger.valueOf(1);
        }
    	return  BigInteger.valueOf(numero).multiply(getFatorial(numero - 1));
    }

}

