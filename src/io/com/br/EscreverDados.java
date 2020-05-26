package io.com.br;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class EscreverDados {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String s = "Texto para ser salvo no arquivo.";
		// exemplo byte
		// try-with-resources faz o close. 
		
		// buffer maior que string
		try (OutputStream os = new FileOutputStream("saida.txt")) {
			byte[] buffer = s.getBytes();
		//	os.write(buffer);
		}
		
		// de uma forma mais facil 
		// mais completa e não usando bytes. 
		
		try(BufferedWriter escrita = new BufferedWriter(new FileWriter("saida.txt")) ){
			//escrita.write(s);	
		}
		
		try(PrintWriter pw = new PrintWriter("saida.txt")){
			pw.println(s);
		}
		


		

	}

}
