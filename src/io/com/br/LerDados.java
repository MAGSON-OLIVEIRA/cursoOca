package io.com.br;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class LerDados {

	public static void main(String[] args) throws IOException {
		// exemplo byte
		// try-with-resources faz o close. 
		
		// buffer maior que string
		try (InputStream is = new FileInputStream("entrada.txt")) {
			byte[] buffer = new byte[1024];
			//is.read(buffer);
			int bytesLidos = is.read(buffer); // pegar so os bytes usando sem o lixo do buffer 
			//String ss = new String(buffer); // nesse caso ele consider o lixo do buffer 1024 caracter

			String s = new String(buffer,0,bytesLidos);// começa na posição 0 ate o tamanho de bytesLidos sem o lixo do buffer. 
			System.out.println(s);
			System.out.println(s.length());
		}

		// buffer menor que string, fazer loop 
		try (InputStream is = new FileInputStream("entrada.txt")) {
			byte[] buffer = new byte[4];

			String s = "";
			int bytesLidos;
			while((bytesLidos = is.read(buffer))>-1) {
				System.out.println(bytesLidos);
				s+=new String(buffer,0,bytesLidos);
			}
//			String s = new String(buffer,0,bytesLidos);// começa na posição 0 ate o tamanho de bytesLidos sem o lixo do buffer. 
			System.out.println(s);
			System.out.println(s.length());
		}
		
		
		
		// de uma forma mais facil 
		// mais completa e não usando bytes. 
		
		try(BufferedReader reader = new BufferedReader(new FileReader("entrada.txt")) ){
			String s ="";
			String line;
			while((line=reader.readLine())!=null) {
				s+=line+"\n";
			}
			System.out.println(s);
		}
		
		
		// usando scanner
		// recebe o file
		try (Scanner scanner = new Scanner(new File("entrada.txt"))){
			String s= "";
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				s+=line+"\n";
			}
			System.out.println(s);
		}
		
		
		
	}

}
