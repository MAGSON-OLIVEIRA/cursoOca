package agenda.com;

public class Menu {

	public static final int OPCAO_SAIR = 6;
	public static final int OPCAO_INSERIR = 1;
	public static final int OPCAO_ALTERAR = 2;
	public static final int OPCAO_EXCLUIR = 3;
	public static final int OPCAO_LISTAR_LETRA = 4;
	public static final int OPCAO_PROCURAR = 5;

	public int exibirOpcoes() throws AgendaException {
		System.out.println("--Menu de Opçoes--");
		System.out.println("# 1) Inserir contato");
		System.out.println("# 2) Alterar contato");
		System.out.println("# 3) Excluir contato");
		System.out.println("# 4) Listar contato");
		System.out.println("# 5) Procurar contato");
		System.out.println("# 6) Sair");
		System.out.println();
		System.out.println("Qual a sua opção >>>: ");

		int opcao = Console.readInt();
		
		
		if(opcao>OPCAO_SAIR || opcao<OPCAO_INSERIR) {
			throw new AgendaException("Opção inválida");
		}
		
		return opcao;
	}

}
