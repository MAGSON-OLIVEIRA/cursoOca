package agenda.com;

import java.io.IOException;
import java.util.List;

/**
 * Controle aplicação
 * 
 */
public class Aplicacao {
	/**
	 * 
	 */
	private Menu menu;
	
	/**
	 * 
	 */
	private Agenda agenda;
	
	/**
	 * Iniciar aplicação. 
	 * @throws IOException
	 */
	public void iniciar() throws IOException {
		menu = new Menu();
		agenda = new Agenda();
		int opcao = 0;
		
		while (opcao != Menu.OPCAO_SAIR) {
			try {
				opcao = menu.exibirOpcoes();
				switch (opcao) {
				case Menu.OPCAO_INSERIR:
					inserir();
					break;
				case Menu.OPCAO_ALTERAR:
					alterar();
					break;
				case Menu.OPCAO_EXCLUIR:
					excluir();
					break;
				case Menu.OPCAO_LISTAR_LETRA:
					listarPorLetra();
					break;
				case Menu.OPCAO_PROCURAR:
					procurar();
					break;
				}

			} catch (AgendaException e) {
				System.out.println("Erro: "+e.getMessage());
				System.out.println();
				
			}

		}
		System.out.println("Fim....");
	}

	private void procurar() {
		System.out.println("Letra: ");
		String parteNome = Console.readString();
		List<Contato> contatos = agenda.listarContatosPorParteNome(parteNome);
		System.out.println("contatos letra "+parteNome.toUpperCase()+" : ");
		if(contatos.isEmpty()) {
			System.out.println("Nada encontrado");
		}else {
			for(Contato contato: contatos) {
				System.out.println(contato);
			}
		}
		System.out.println();
		
	}

	private void listarPorLetra() {
		System.out.println("Letra: ");
		char letra = Console.readChar();
		List<Contato> contatos = agenda.listrContatosPorLetra(letra);
		System.out.println("contatos letra "+Character.toUpperCase(letra)+" : ");
		if(contatos.isEmpty()) {
			System.out.println("Nada encontrado");
		}else {
			for(Contato contato: contatos) {
				System.out.println(contato);
			}
		}
		System.out.println();
	}

	private void excluir() throws AgendaException, IOException {
		System.out.println("Nome: ");
		String nome = Console.readString();

		Contato contato = agenda.obterContato(nome);
		if (contato == null) {
			throw new AgendaException("Contato não encontrado.");
		}

		agenda.excluir(contato.getNome());
		System.out.println("Ok");
		System.out.println("");
		
	}

	private void alterar() throws AgendaException, IOException {
		System.out.println("Nome: ");
		String nome = Console.readString();

		Contato contato = agenda.obterContato(nome);
		if (contato == null) {
			throw new AgendaException("Contato não encontrado.");
		}

		System.out.println("Telefone: ");
		String telefone = Console.readString();
		contato.setTelefone(telefone);
		agenda.alterar(contato);
		System.out.println("Ok");
		System.out.println("");

	}

	private void inserir() throws AgendaException, IOException {
		System.out.println("Nome: ");
		String nome = Console.readString();
		System.out.println("Telefone: ");
		String telefone = Console.readString();
	
		Contato contato = new Contato(nome, telefone);
		agenda.inserir(contato);
		System.out.println("Ok");
		System.out.println("");		
	}

}
