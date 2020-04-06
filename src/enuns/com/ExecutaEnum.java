package enuns.com;

public class ExecutaEnum {

	enum Sexo{
		masculino, feminino
	}
	
	public static void main(String[] args) {
		
		String s = "1";
		
		DiadaSemana d = DiadaSemana.valueOf(s);
		System.out.println(d.getIn());
	}
	
	Sexo sexo = ExecutaEnum.Sexo.masculino;

}
