package stringsData.com;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class AplicationString {

	public static void main(String[] args) {

		Instant start = Instant.now();
		String s = new String("abc");
		s.toUpperCase();
		
//		System.out.println(s);
//		System.out.println(s.toUpperCase());
//		System.out.printf("%5s", "000000000000000030");
		
		String ste = "0000012";
		
		
		ste = ste.substring(ste.length()-3);
		
		System.out.println(ste);
//		System.out.format("%d", 123);
//		System.out.format("%b", 123);
//		
//		System.out.format(">%7d<\n>%7s<", 200, "abc");
//
//		
//		LocalDate d = LocalDate.parse("03/01/2019", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//		
//		System.out.println(d.toString());
//		
//		// exp pequeno exemplo
//		
//		LocalDate d1 = LocalDate.now();
//		LocalDate d2 = LocalDate.parse("1984-01-03");
//		Period p = Period.between(d2, d1);
//		System.out.println(p.getYears());
//		System.out.println(p.getMonths());
//		System.out.println(p.getDays());
//		
//		// usar o chronoUnit saber os mese entre duas data
//		
//		System.out.println(ChronoUnit.MONTHS.between(d2, d1));
//		
//		Instant end = Instant.now();
//		
//		Duration du = Duration.between(start, end);
//		System.out.println(du.getSeconds());
//		
//		System.out.println(gerarNumeroRandomicoIntervalo(13,33));
//		System.out.println(Math.ceil(1.6666));
//		//saido 2.0
		
	}
	
	static int gerarNumeroRandomicoIntervalo(int inicio, int fim) {
		int intervalo = fim  - inicio;
		int n = (int) (Math.random() * intervalo)+inicio;
		return n;
	}

}
