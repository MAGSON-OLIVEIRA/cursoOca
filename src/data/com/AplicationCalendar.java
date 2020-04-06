package data.com;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class AplicationCalendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		// setando item a item no calendar 
		cal.set(Calendar.YEAR, 2020);
		// o mes começa pela 0 - janeiro, 1 fevereiro, 2 março, ......
		cal.set(Calendar.MONDAY, 2);// março
		
		//podemos set todo de uma so vez
		cal.set(2022, 0, 01, 10, 56);
		
		// getTime do calendar retorna um DATE();
		
		System.out.println(cal.getTime());
		
		
		// data receber um calendar
		
		Date date = cal.getTime();
		
		// calendar receber um date
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date);
		
		DateFormat df445 = DateFormat.getDateInstance(DateFormat.LONG, new Locale("en","US"));
		String fw445 = df445.format(date);
		System.out.println(fw445);
		
		DateFormat df4452 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		String fw4452 = df4452.format(date);
		System.out.println(fw4452);
		
		SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd");
		String fw44523 = sp.format(date);
		System.out.println(fw44523);
		
		
		String stringData = "20300701";
		
		SimpleDateFormat sp2 = new SimpleDateFormat("yyyyMMdd");
		try {
			Date d12 = sp2.parse(stringData);
			System.out.println(d12);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
		String dsdsd = "20202801";
		SimpleDateFormat fod = new  SimpleDateFormat("yyyyddMM");
		try {
			Date dsdssd  = fod.parse(dsdsd);
			System.out.print(dsdssd);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
