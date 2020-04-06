package stringsData.com;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class AplicationFormat {

	public static void main(String[] args) {
		System.out.format("%.2f\n", 100.0);
		System.out.printf(">%7d<\n>%7s<\n", 2000, "abc");
		System.out.format("%05d\n", 25);
		
		// formatando numetro
		// podemos definir sua localidade
		
		NumberFormat nfbr = NumberFormat.getInstance();
		NumberFormat nfuse = NumberFormat.getInstance(new Locale("en","US"));
		String s = nfbr.format(1000.5);
		String s2 = nfuse.format(1000.4);
		
		System.out.println(s);
		System.out.println(s2);
		
		// formatar moeda.
		Locale l = new Locale("pt", "BR");
		NumberFormat nfmone = NumberFormat.getCurrencyInstance(l);
		String sss = nfmone.format(1000.5);
		
		String d = "0009999";
		DecimalFormat dc = new DecimalFormat("0000");
		String s5 = dc.format(Integer.parseInt(d));
		
		System.out.println(s5);
		
	}

}
