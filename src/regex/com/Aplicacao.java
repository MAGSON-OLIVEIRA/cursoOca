package regex.com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aplicacao {
	public static void main(String[] args) {
		// 		metacaracter
		// 		quatificadore 
		// 		pattern matcher
		//		tokeniza��o. 
		
		//    \d digito 0a9
		//    \s epa�o em branco
		//    \w caracteres alfanum�rico digitos, letras e _
		//    . qualquer carcter
		// outros ver javadoc classe Pattern
		
		
		// metacaracteres  \d digito \s espa�o em branco \w caractere alfanumericos   . (ponto) busca qualquer coisa.   java doc pattern
		// ([abc])  a, b ou c.  esse conjunto � aceitavei 
		//  - indica uma faxa um ranger. 
		
	
		
		String s = "abcabcabc";
		// barra investida no java e usando numa string para resolver isso usar duas barra investida. 
		String d = "\\d";
		String p = "\\w\\d";
		
		// quantificadore busca em quantidade. * -> zero ou mais ocorrencia.  + uma ou mais ocorencia. ? nenhuma ou uma ocorrencia. 
		// exemplo de cep 
		// 34509-309 ou 34509 390 ou 34509390
		// para quantificar usar os parentes. 
		
		//cep
		// \d\d\d\d\d([\s])?\d\d\d
		
		//  o sinal de + defini que eu posso ter de A a Z maiusculo ou minisculo uma ou mais vezes. e o numero tamb�m posso te de zero a nove uma ou mais vezer o sinal de + defini isso 
		// ([A-Za-z])+-([0-9])+
		
		// classe pattern e Matcher. 
		Pattern ps = Pattern.compile("ab+");
		Matcher m = ps.matcher("AABabbbbcarrssfsdsab");
//		while(m.find()) { // find encontra os padrao no while
//			int start = m.start();  // posi��o inicial do padro 
//			String group = m.group(); // retornar a string do padr�o que foi encontrado. 
//			System.out.println(start + " >> " + group );
//		}
//		
		
		StringBuffer sb = new StringBuffer();// para fazer um substiur um caraceter tem que usar o StringBuffer.  gerar a saida com a subistitui��o do caracter. 
		
		while(m.find()) {
			m.appendReplacement(sb,"XX");// vai escrever a string substituida no sb. 
		}
		
		m.appendTail(sb);// usar para mostrar ate o ultmo carec
		System.out.println(sb.toString() );
		
		 
		// s.replaceFirst subistitui a primeira string
		// s.replaceAll subistgitui tudo
		
		
		// tokeniza��o. 
		// dividir ma quantidade de informa��o em peda�o menores 
		
	}
}
