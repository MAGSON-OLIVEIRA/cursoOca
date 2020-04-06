package localDateTime.com;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class IntegrarDateCalendar {

	public static void main(String[] args) {
		// data para localdatetime
		Date date = new Date();
		Instant i = date.toInstant();
		LocalDateTime ldt = LocalDateTime.ofInstant(i, ZoneId.systemDefault());
		
		// localdatetime para data
		LocalDateTime ldts = LocalDateTime.now();
		Instant i2 = ldts.atZone(ZoneId.systemDefault()).toInstant();
		Date dates = Date.from(i2);
		
		// calendar para localdatetime
		Calendar  cal = Calendar.getInstance();
		Instant instant = cal.toInstant();
		LocalDateTime novdate = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
		
		LocalDateTime ldsts = LocalDateTime.now();
		Instant instant23 = ldsts.atZone(ZoneId.systemDefault()).toInstant();
		Calendar calend = Calendar.getInstance();
		calend.setTime(Date.from(instant23));
		

	}

}
