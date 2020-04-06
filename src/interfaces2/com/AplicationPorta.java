package interfaces2.com;

public class AplicationPorta {

	public static void main(String[] args) {
		Porta p = new Porta(12,22);
		p.abrir();
		System.out.println(p.getAltura() +" "+ p.getLargura() +" "+  p.isAberta());
		Porta p2 = (Porta) p.clone();
		System.out.println(p2.getAltura() +" "+ p2.getLargura() +" "+  p2.isAberta());
	}

}
