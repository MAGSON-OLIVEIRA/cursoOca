package io.com.br;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopiarArquivo {

	public static void main(String[] args) throws IOException {
		String inputFile = "entrada.txt";
		String outputFile = "saida.txt";
		
//		InputStream in = new FileInputStream(inputFile);
//		OutputStream out = new FileOutputStream(outputFile);
		// definir as duas dentro do try pra fazer o close automatico
		try(InputStream in = new FileInputStream(inputFile);
			OutputStream out = new FileOutputStream(outputFile)){
			byte[] buffer = new byte[1024];
			int bytesLidos;
			// bytesLidos recebe os bytes do in entrada que é de outro arquivo. 
			// o out recebe os bytes do int no loop.
			// assim fazendo a copia do arquivo de qualquer tamanho. 
			while((bytesLidos = in.read(buffer))>-1) {
				out.write(buffer,0,bytesLidos);
			}
			
		}

	}

}
