package localDateTime.com;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class AplicationLocalDateTime {

	public static void main(String[] args) {
		
		// api do pacote do java.time. 
		
		LocalDate dss = LocalDate.of(2020, 1, 11);
		LocalTime temp = LocalTime.of(13, 44);
		
		
		LocalDate dateMinus = LocalDate.now();
		LocalDate novadate = dateMinus.plusDays(5);
		LocalDate novadate2 = dateMinus.minus(1, ChronoUnit.WEEKS);
		
		
		LocalTime tempoMunutes = LocalTime.now();
		LocalTime tempo2 = tempoMunutes.plusHours(2).plusMinutes(20);
		LocalTime tempo3 = tempoMunutes.minus(100, ChronoUnit.MILLIS);
		
		
		LocalDateTime dateMinus2 = LocalDateTime.now();
		LocalDateTime novadate22 = dateMinus2.plusDays(5).plusHours(2);
		LocalDateTime novadate222 = dateMinus2.minus(1, ChronoUnit.WEEKS);
		
		
		String dataNascimento = "17/05/1982 22:00";
		LocalDateTime d1 = LocalDateTime.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		LocalDateTime d2 = LocalDateTime.now();
		
		Period periodo = Period.of(0, 1, 7);
		LocalDate dataRecebePeriodoAmais = LocalDate.now().plus(periodo);
		
		Duration duration = Duration.ofMinutes(10);
		LocalTime tempoMaisDuration = LocalTime.now().minus(duration);
		
		
		Duration d = Duration.between(d1, d2);
		System.out.println("Hora" + d.toHours());
		System.out.println("Dias" + d.toDays());
		
		Period p = Period.between(d1.toLocalDate(), d2.toLocalDate());
		System.out.println(p.toTotalMonths());
		
		
		System.out.println(ChronoUnit.WEEKS.between(d1, d2));
		System.out.println(ChronoUnit.YEARS.between(d1, d2));
		
		
	}

}
