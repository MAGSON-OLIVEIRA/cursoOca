package regex.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TokenizacaoAplication {

	public static void main(String[] args) throws FileNotFoundException {
		int[][] elementos = new int[4][4];
		Scanner s = new Scanner(new File("dados.txt"));
		int j = 0;
//		while (s.hasNext()) {
//			String line = s.nextLine();
//			String[] tokens = line.split("\t");
//			String[] tokens2 = line.split(" ");
//			// System.out.println(Arrays.toString(tokens));
//			for (int i = 0; i < tokens2.length; i++) {
//				tokens2[i] = tokens2[i].replace("'", "");
//				elementos[j][i] = Integer.parseInt(tokens2[i]);
//			}
//			// incrementar o j
//			j++;
//		}
		
		// usando o regex fica mais simples nesse caso. 
		// \d pego so numericos. 
		Pattern p = Pattern.compile("\\d");
		while (s.hasNext()) {
			String line = s.nextLine();
			Matcher m = p.matcher(line);
			int i = 0;
			while(m.find()) {
				elementos[j][i] = Integer.parseInt(m.group());
				i++;
			}

			j++;
		}

		for (int a = 0; a < elementos.length; a++) {
			for (int b = 0; b < elementos[a].length; b++) {
				System.out.print(elementos[a][b] + "\t");
			}
			System.out.println();
		}
		
		
		
		List<Integer> numeros = new ArrayList<Integer>();
		String texto = "102003004005";
		Scanner scannerss = new Scanner(texto);
		scannerss.useDelimiter("0+");
	
		while(scannerss.hasNext()) {
			numeros.add(scannerss.nextInt());
		}
		
		System.out.println(numeros.toString());

	}

}
