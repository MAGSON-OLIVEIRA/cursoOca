package execicio.stringData.com;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.Format;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AplicationExercicios {
	public static void main(String[] args) {
		
	List<Produto> list = new ArrayList<Produto>();
	Produto p1 = new Produto();
	p1.setDataValidade(LocalDate.of(2020, Month.DECEMBER, 10));
	p1.setPeso(2.5);
	p1.setDescriProduto("P1asd");
	list.add(p1);
	Produto p2 = new Produto();
	p2.setDataValidade(LocalDate.of(2019, Month.AUGUST, 02));
	p2.setPeso(3.4);
	p2.setDescriProduto("P2");
	list.add(p2);
	Produto p3 = new Produto();
	p3.setDataValidade(LocalDate.of(2018, Month.SEPTEMBER, 22));
	p3.setDescriProduto("Pqwerqw3");
	p3.setPeso(4.4);
	list.add(p3);
	int i = 1;
		for (Produto p : list) {
//		Instant instant = p.getDataValidade().atStartOfDay(ZoneId.systemDefault()).toInstant();	
//		LocalDateTime ldt = LocalDateTime.now();
//		Instant instant = ldt.atZone(ZoneId.systemDefault()).toInstant();
//		Date dataValidade = Date.from(instant);
//		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
//		String ndt = df.format(dataValidade);
			
			
			DecimalFormat dcf = new DecimalFormat("0000000.00");
			dcf.setGroupingUsed(true);
			DecimalFormatSymbols dfs = new DecimalFormatSymbols();
			dfs.setDecimalSeparator('.');
			dcf.setDecimalFormatSymbols(dfs);
			String s55 = dcf.format(p.getPeso());
			
			String s5 = dcf.format(p.getPeso());
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			String hojeFormatado = p.getDataValidade().format(formatter);
			//System.out.printf("%s) %12s %s %s \n",i , p.getDescriProduto() , s55, hojeFormatado );
			String str2 = String.format("%s) %12s %s %s",i , p.getDescriProduto() , s55, hojeFormatado);
			System.out.println(str2);

			i++;
		}
//		System.out.printf(">%7d<\n>%7s<", 2000, "abc");
//		System.out.printf("%.2f", 100.0);
//		System.out.printf("%d, %f", 245, 100.0);
//		System.out.printf("%05d", 25);
		
		
		String s = "ee";
		System.out.println(processar(s));
		
		

	
	}
	
	public static String processar(String s) {
		if (s == null) {
			return s = null;
		}
		if(s.length() <= 3) {
			s = s.toUpperCase();
			return s;
		}
		
		if(s.length() > 3) {
			String s2 = s.substring(0,3);
			String s3 = s.substring(3);
			StringBuilder revert = new StringBuilder();
			revert.append(s2);
			revert = revert.reverse();
			revert.append(s3);
			String temp = revert.toString().toUpperCase();
			return temp;
		}
		 return null;
	}
	
	
	//A primeira informação é um número sequencial, iniciado em 1. 
	//A segunda informação é o nome do produto. Ele deve ocupar 12 caracteres. Caso seu nome tenha menos que isso, 
	//ele deve ficar alinhado à direita e os caracteres que faltam devem ser preenchidos com espaços em branco.
	//A terceira informação é o peso. Ele deve ter duas casas decimais (separadas com o uso de vírgula) e ocupar 
	//uma área de 9 caracteres. Se o número tiver menos de 9 caracteres, ele deve ser preenchido com 0’s à esquerda
}
