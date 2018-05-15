package br.edu.udesc.business;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo{
	private static File file = new File("Caminho do arquivo");
	private static final void read(File file) throws IOException{
		FileReader fileReader = new FileReader(file);
		BufferedReader reader = new BufferedReader(fileReader);
		String data = null;
		while((data = reader.readLine()) != null){
			System.out.println(data);
		}
		fileReader.close();
		reader.close();
	}
	public static void shhhhhhhhh(String[] args) {
		try{
			LerArquivo.read(file);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}