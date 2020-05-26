package array.com.br;

public class ArrayMult {

	public static void main(String[] args) {
		String [][] arraysIn = new String[3][3];
		String [] valorIn = new String[]{"X","O"};
		String [] qtdJogadas = new String[8];
	
		// vertical
		arraysIn[0][2]="O";
		arraysIn[1][2]="X";
		arraysIn[2][2]="X";
		
		arraysIn[0][1]="O";
		arraysIn[1][1]="X";
		arraysIn[2][1]="O";
		
		arraysIn[0][0]="X";
		arraysIn[1][0]="O";
		arraysIn[2][0]="O";
		
		String [] arrayTemp;
		String [] arrayTemp2;
		String msn = "";
		
		for (int i = 0; i < arraysIn.length; i++) {
			arrayTemp = new String[3];  
			arrayTemp2 = new String[3];
			for (int j = 0; j < arraysIn[0].length; j++) {
				if(arraysIn[i][j]==null) {
					arraysIn[i][j] = "_";
				}
				arrayTemp[j]=arraysIn[i][j];
				arrayTemp2[j]=arraysIn[j][i];
				System.out.print(arraysIn[i][j]);
				if (arraysIn[0].length > j + 1) {
					System.out.print(" | ");
				}
			}
			if(horizontal(arrayTemp)||horizontal(arrayTemp2)) {
				msn = "HOUVE UM GANHADOR";
			}else {
				msn = "NÃO HOUVE UM GANHADOR";
			}
			System.out.println(" ");
			
		}
		if(diagonal(arraysIn)) {
			msn = "HOUVE UM GANHADOR";
		}
		System.out.println(msn);
	}

	private static void extracted(String[][] arrays) {
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays[0].length; j++) {
				if(arrays[i][j]==null) {
					arrays[i][j] = "_";
				}
				System.out.print(arrays[i][j]);
				if (arrays[0].length > j + 1) {
					System.out.print(" | ");
				}
			}
			System.out.println(" ");
		}
	}
	
	public static boolean horizontal(String[] arrays) {
		String temp = "";
		for (int i = 0; i < arrays.length; i++) {
			if (!temp.equals("")) {
				if (temp.equals(arrays[i])) {
					temp = arrays[i];
					continue;
				} else {
					return false;
				}
			} else {
				temp = arrays[i];
			}
		}
		return true;
	}

	public static boolean diagonal(String[][] arrays) {
		if (arrays[0][0].equals("O") && arrays[1][1].equals("O") && arrays[2][2].equals("O")) {
			return true;
		}
		if (arrays[0][0].equals("X") && arrays[1][1].equals("X") && arrays[2][2].equals("X")) {
			return true;
		}
		if (arrays[0][2].equals("O") && arrays[1][1].equals("O") && arrays[2][0].equals("O")) {
			return true;
		}
		if (arrays[0][2].equals("X") && arrays[1][1].equals("X") && arrays[2][0].equals("X")) {
			return true;
		}  
		///
 		if (arrays[0][2].equals("X") && arrays[1][1].equals("X") && arrays[2][0].equals("X")) {
			return true;
		}
		if (arrays[0][2].equals("O") && arrays[1][1].equals("O") && arrays[2][0].equals("O")) {
			return true;
		}
		if (arrays[0][2].equals("X") && arrays[1][1].equals("X") && arrays[2][0].equals("X")) {
			return true;
		}
		return false;
	}
	


}
