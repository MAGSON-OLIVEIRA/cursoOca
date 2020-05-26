package io.com.br;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class AplicacaoIO {
	
	public static void main(String[] args) throws IOException {
		
		InputStream in = System.in;
		//InputStream inn = new FileInputStream("saida.txt");
		InputStreamReader isr = new InputStreamReader(in);
		
		
		BufferedReader br = new BufferedReader(isr);
		
		String s =  br.readLine();
		
		System.out.println(s);
		
		
		OutputStream os = new FileOutputStream("saida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write("teste");
		
		
		// apenas para arquivo de texto
		
		// para caracter
		Reader r = new FileReader("entrada.txt");
		Writer w = new FileWriter("saida.txt");
		
		// para strings 
		
		BufferedReader brr = new BufferedReader(r);
		BufferedWriter bww = new BufferedWriter(w);
		
		// scanner ler dados
		//
		
		Scanner sss = new Scanner(new FileInputStream("entrada.txt")); // pode usar qualque imputStream ou reader
		
		// pode trabalhar com tokens
		while(sss.hasNextLine()) {
			String token = sss.nextLine();
		}
		
		// O delimitado do exemplo line, mas tem outro delimitadore que pode ser usado. 
		
		
		// printStream
		
		PrintStream ps = new PrintStream(new FileOutputStream("daida.txt"));
		ps.println("text");
		
		// pode usar qualquer outPutStream
		// temos o metodo print
		
		// Classe java.io.file
		// acessa as informaçoes sobre um arquivo ou diretório no sistema de arquivos. 
		File ff =  new File("c:/arquivos/arquivo.txt");
		ff.isDirectory(); // mostra se é uma arquivo ou diretorio
		ff.exists(); // ver se existe o arquivo ou diretorio
		ff.getName(); // nome do arquivo ou diretorio
		ff.getPath(); // caminha 
		ff.listFiles(); // lista o que tem no diretorio
		
		
		InputStream isss = null;
		// try-with-resources
		//ex sem
		try {
			isss = new FileInputStream("entrada.txt");
		}finally {
			if(isss != null) {
				isss.close();
			}
		}
		
		// ex com 
		
		try(InputStream iiss = new FileInputStream("entrada.txt")){
			// fazendo o try dessa maneira faz o close automaticamente. AutoCloseable. Interface Closeable
			// entao o close é feito automatico. sem precisar do finally
		}
		
		
		
	}

}
