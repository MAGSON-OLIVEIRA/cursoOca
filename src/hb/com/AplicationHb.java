package hb.com;

public class AplicationHb {

	public static void main(String[] args) {
		/**
		 * até 20 litros, desconto de 4% por litro
acima de 20 litros, desconto de 6% por litro Escreva um algoritmo que leia o número

de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool, G-
gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do

litro da gasolina é R$ 3,98 o preço do litro do álcool é R$ 3,15.

		 */
		final String TP_G = "G";
		final String TP_A = "A";
		final double VL_GAS = 3.98;
		final double VL_ALC = 3.15;
		final int VL_PAR = 20;
		// São os Valores de entrada IN
		int qtLitros = 15;
		String inTipo = "G";
		String desconto = null;
		
		switch (inTipo) {
		case TP_G: {
			double subTotal = qtLitros*VL_GAS;
			double totalDesconto = 0.0;
			if(qtLitros <=VL_PAR) {  // 4 %
				desconto = "4%";
				totalDesconto = subTotal - ((subTotal*4) /100);
			}else { // 6 %
				desconto = "6%";
				totalDesconto = subTotal - ((subTotal*6) /100);
			}
			System.out.println("Valor sem desconto:  R$:" +subTotal);
			System.out.println("Valor a ser pago com desconto: "+ desconto+ " R$:" +totalDesconto);
			break;
		}
		case TP_A:{
			double subTotal = qtLitros*VL_ALC;
			double totalDesconto = 0.0;
			if(qtLitros <=VL_PAR) {  // 4 %
				desconto = "4%";
				totalDesconto = subTotal - ((subTotal*4) /100);
			}else { // 6 %
				desconto = "6%";
				totalDesconto = subTotal - ((subTotal*6) /100);
			}
			System.out.println("Valor sem desconto:  R$:" +subTotal);
			System.out.println("Valor a ser pago com desconto: "+ desconto+ " R$:" +totalDesconto);
			break;
		}
		default:
			throw new IllegalArgumentException("Infome o tipo de combustivel.");
		}
		


	}

}
