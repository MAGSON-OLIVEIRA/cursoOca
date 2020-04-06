package format.com;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatAplication {

	public static void main(String[] args) {
		
		
		Locale l = new Locale("pt", "BR");
		NumberFormat formatNumero = NumberFormat.getNumberInstance(l);
		String numFormat = formatNumero.format(1111.1);
		System.out.print(numFormat);
		
		Locale l2 = new Locale("pt", "BR");
		NumberFormat moneFormatNumber = NumberFormat.getCurrencyInstance(l2);
		String moneFormat = moneFormatNumber.format(1111.1);
		System.out.println(moneFormat);
		

		  
		DecimalFormat df = new DecimalFormat("0.##");
		String dfss = df.format(122);
		System.out.print(dfss);

		
		
		
	}

}
