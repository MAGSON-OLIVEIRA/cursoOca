package localDateTime.com;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class AplicationInstat {
	public static void main(String[] args) {
		
		Instant start = Instant.now();
		
		LocalDate dss = LocalDate.of(2020, 1, 11);
		LocalTime temp = LocalTime.of(13, 44);
		
		
		LocalDate dateMinus = LocalDate.now();
		LocalDate novadate = dateMinus.plusDays(5);
		LocalDate novadate2 = dateMinus.minus(1, ChronoUnit.WEEKS);
		
		
		Instant end = Instant.now();
		
		Duration d = Duration.between(start, end);
		long seconds = d.getSeconds();
		
		System.out.println(seconds);
		
		
	}

}
