package br.edu.udesc.business;

import java.math.BigInteger;

import br.edu.udesc.exceptions.InputException;

/**
 * Assinatura para o SuperFatorial
 * @author udesc
 *
 */
public interface ISuperFatorial {
    
    /**
     * Recebe o fatorial do número e retorna o superfatorial dele
     * @param numero para o qual calcularemos o superfatorial
     * @return super fatorial
     */
    public BigInteger getSuperFatorial(int numero)  throws InputException;


}
