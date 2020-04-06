package data.com;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class AplicationJavaTime {

	public static void main(String[] args) {
		String datanscimento = "17/05/1982 22:00";
		LocalDateTime d1 = LocalDateTime.parse(datanscimento, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		LocalDateTime d2 = LocalDateTime.now();
		
		// trabalho com horas miniutos e segundos m ... usar o Duration
		Duration d = Duration.between(d1, d2);
		System.out.println("h: "+d.toHours());
		System.out.println("D: "+d.toDays());
		
		// com meses e anos usar o Period
		
		Period p = Period.between(d1.toLocalDate(), d2.toLocalDate());
		System.out.println(p.toTotalMonths());
		System.out.println("Anos 1 "+p.getYears());
		System.out.println("Anos: " +ChronoUnit.YEARS.between(d1, d2));
		System.out.println("Semanas "+ ChronoUnit.WEEKS.between(d1, d2));
		
		System.out.println("decadasX "+ ChronoUnit.DECADES.between(d1, d2));
		

	}

}
