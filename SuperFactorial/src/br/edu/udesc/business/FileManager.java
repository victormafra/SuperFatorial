/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.udesc.business;

import java.math.BigInteger;
import java.io.*;

/**
 *
 * @author TTK
 */
public class FileManager {
    
    public boolean containsKey(int numero, String fileName){
        String line =null;
        boolean retorno=false;
        try {
            FileReader fr = new FileReader(fileName);
            
            BufferedReader br = new BufferedReader(fr);
            int i =1;
            while( (line = br.readLine()) != null) {
                if(i%2 ==1 && numero==Integer.parseInt(line)) {
                    retorno = true;
                    break;
                }
                i++;
            }
            br.close(); 
            
        }
        catch (FileNotFoundException fe) {
             System.out.println("File not found");
        }
        catch (IOException fe) {
            System.out.println("Error loading file");
        }
        return retorno;
    }
    
    public BigInteger get(int numero, String fileName){
        String line =null;
        try {
            FileReader fr = new FileReader(fileName);
            
            BufferedReader br = new BufferedReader(fr);
            int i =1;
            while( (line = br.readLine()) != null) {
                if(i%2 ==1 && numero==Integer.parseInt(line)) {
                    line = br.readLine();
                    break;
                }
                i++;
            }
            br.close(); 
            
        }
        catch (FileNotFoundException fe) {
             System.out.println("File not found");
        }
        catch (IOException fe) {
            System.out.println("Error loading file");
        }
        return new BigInteger(line);
    }
    
    public void put(int numero, BigInteger numeroDois, String fileName){
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.newLine();
            bufferedWriter.write(numero);
            bufferedWriter.newLine();
            bufferedWriter.write(numeroDois.toString());
        }
        catch (IOException ie){
            System.out.println("Error reading file");
        }
    }
}
