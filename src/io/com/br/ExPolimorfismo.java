package io.com.br;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;	

public class ExPolimorfismo {

	public static void main(String[] args) throws IOException {
		// pode fazer farios tipos de chamadas. via arquivo ou console.
		// 1 ex de arquivo para arquivo
//		FileInputStream fin = new FileInputStream("entrada.txt");
//		FileOutputStream fout = new FileOutputStream("saida.txt");
//		transfer(fin, fout);
		
		// apresnta via console. OutputStream
		FileInputStream fin = new FileInputStream("entrada.txt");
		OutputStream cout = System.out;
		transfer(fin, cout);
		
		
		// entrada via console Inptu
		InputStream cin = System.in;
		FileOutputStream fout = new FileOutputStream("saida.txt");
		transfer(cin, fout);
		
		
		// apresnta via console. OutputStream
		FileInputStream fin2 = new FileInputStream("entrada.txt");
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		// usando um array de byte
		transfer(fin2, bout);
		
		byte[] bytes = bout.toByteArray();
		String s = new String(bytes);
		System.out.println(s);
		
	}
	
	private static void transfer(InputStream in, OutputStream out) throws IOException{
		try(in; out){
			byte[] buffer = new byte[1024];
			int bytesLidos;
			while((bytesLidos = in.read(buffer))>-1) {
				out.write(buffer,0,bytesLidos);
			}
		}
	}

}
