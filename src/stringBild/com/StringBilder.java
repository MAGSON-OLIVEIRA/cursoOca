package stringBild.com;

import java.util.ArrayList;
import java.util.List;

public class StringBilder {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aadfasd");
		list.add("");
		list.add("aadfasd1");
		list.add(null);
		list.add("aadfasd4");
		list.add("");
		list.add("aadfasd8");
		list.add(" ");
		System.out.print(joinStringUtils(list, "="));
//		String s = "";
//		for(int i=0; i<100; i++) {
//			s=s+"x";
//		}
	}
	
	public static String joinStringUtils(List<String> textList, String separador) {
		String out = "";
		if (textList.size() == 0) {
			return out;
		}
		StringBuilder sb = new StringBuilder();
		textList.forEach(s -> {
			if (!isEmpty(s)) {
				sb.append(s + separador);
			}
		});
		String s = sb.toString();
		if (s.length() >= 0) {
			if (isEmpty(separador)) {
				out = s;
			} else {
				out = s.substring(0, s.length() - 1);
			}
		}
		return out;
	}
	
	public static boolean isEmpty(String s) {
		if(s==null) {
			return true;
		}
		return s.trim().length() == 0;
	}

}
