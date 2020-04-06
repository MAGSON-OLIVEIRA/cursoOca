package data.com;

import java.util.Calendar;
import java.util.Date;

public class AplicacaoDate {
	public static void main(String[] args) {
		
		Date date = new Date();
		
		//System.out.println(date.getTime());
		
		Calendar cal = Calendar.getInstance();
		cal.set(2001, 1, 1);
		cal.set (Calendar.YEAR, 2);
	
		date = cal.getTime();
		
		System.out.println(date);

	}

}
