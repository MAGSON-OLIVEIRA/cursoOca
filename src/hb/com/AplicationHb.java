package hb.com;

public class AplicationHb {

	public static void main(String[] args) {
		/**
		 * at� 20 litros, desconto de 4% por litro
acima de 20 litros, desconto de 6% por litro Escreva um algoritmo que leia o n�mero

de litros vendidos, o tipo de combust�vel (codificado da seguinte forma: A-�lcool, G-
gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o pre�o do

litro da gasolina � R$ 3,98 o pre�o do litro do �lcool � R$ 3,15.

		 */
		final String TP_G = "G";
		final String TP_A = "A";
		final double VL_GAS = 3.98;
		final double VL_ALC = 3.15;
		final int VL_PAR = 20;
		// S�o os Valores de entrada IN
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
