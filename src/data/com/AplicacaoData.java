package data.com;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class AplicacaoData {

	public static void main(String[] args) {
		String dataNasci = "02/01/1984 22:00";
		// convert para um objeto local dateTime
		
		LocalDateTime di = LocalDateTime.parse(dataNasci, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		LocalDateTime de = LocalDateTime.now();
		// horas e dias de um periodo de tanto a tanto.
		Duration d = Duration.between(di, de);
		System.out.println("Horas " + d.toHours());
		System.out.println("Dias "+ d.toDays());
		// saber os mese de um periodo de tanto a tanto. tem que ser locaDate Usar o ToLocalDate
		Period p = Period.between(di.toLocalDate() , de.toLocalDate());
		System.out.println("Meses " + p.toTotalMonths());
		// para saber semanas e anos de um periodos
		System.out.println("Semanas " + ChronoUnit.WEEKS.between(di, de));
		System.out.println("Anos "+ ChronoUnit.YEARS.between(di, de) );
	}

}
