package jogodaVelha.com;

import java.util.Scanner;

public class AplicationJogoVelha {
	
	public static void main(String[] args) {
	
		Integer matrix[][] = new Integer[3][3];
		String matrix2[][] = new String[3][3];
		int cont = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(" | "+cont+" | ");
				matrix[i][j]  = cont++;
			}
			System.out.println();
		}
		
	
		for (int l = 0; l < 2; l++) {
			System.out.print("Informe um dos item acima(referente a posição que vc quer jogar)->:");
			Scanner s = new Scanner(System.in);
			int item = s.nextInt();

			System.out.print("Informe o que vc vai ser ((bola)o ou  (xis)x)->:");
			Scanner s2 = new Scanner(System.in);
			String ser = s2.next();

			for (int i = 0; i < 3; i++) {

				for (int j = 0; j < 3; j++) {
					if (item == matrix[i][j]) {
						matrix2[i][j] = ser;
						System.out.print(" | " + matrix2[i][j] + " | ");
					} else {
						if (matrix2[i][j] == null) {
							matrix2[i][j] = "_";
							System.out.print(" | " + matrix2[i][j] + " | ");
						} else {
							System.out.print(" | " + matrix2[i][j] + " | ");
						}

					}
				}
				System.out.println();
			}
		}	
	}

}
