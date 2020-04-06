package data.com;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


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
		
		
		
		
		Date date = new Date();
		long mili = date.getTime();
		
		System.out.println(mili);
		
		Calendar cal = Calendar.getInstance();
		//cal.set(Calendar.YEAR, 2011);
		// adicionando 7 dias a mais
		cal.add(Calendar.DAY_OF_MONTH, 7);
			
		// Ou
		cal.set(2020, 1, 5, 5, 2, 55);
		Date dacal = cal.getTime();
		
		System.out.println(dacal);
		
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
		String fw = df1.format(dacal);
		
		System.out.println(fw);
		
		
		DateFormat df44 = DateFormat.getDateInstance(DateFormat.LONG);
		String fw44 = df44.format(dacal);
		
		System.out.println(fw44);
		
		
		DateFormat df445 = DateFormat.getDateInstance(DateFormat.LONG, new Locale("en","US"));
		String fw445 = df445.format(dacal);
		System.out.println(fw445);
		
		
		SimpleDateFormat dfdee = new SimpleDateFormat("yyyy-MM-dd");
		String fw44533 = dfdee.format(dacal);
		System.out.println(fw44533);
		
		
		String ds1 = "2004-07-21";
		// usar o padrao acima
		try {
			Date d3322 = dfdee.parse(ds1);
			System.out.println(d3322);
		}catch (ParseException e) {
			e.getStackTrace();
		}
		
		
		String ds12 = "20040721";
		SimpleDateFormat dfdee2 = new SimpleDateFormat("yyyyMMdd");
		try {
			Date d33220 = dfdee2.parse(ds12);
			System.out.println(d33220);
		}catch (ParseException e) {
			e.getStackTrace();
		}
		
		
	}

}
