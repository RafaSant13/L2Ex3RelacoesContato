package model;

public class AgendaTelefonica {
	
	private Lista<Contato> contatos;

	public AgendaTelefonica() {
		this.contatos = new Lista<Contato>();
	}
	
	public void adicionarContato(Contato contato) throws Exception {
		contatos.addLast(contato);
	}
	
	public void removerContato(String nome) throws Exception {
		int tamanho = contatos.size();
		for (int i = 0; i < tamanho; i++) {
			Contato c = contatos.get(i);
			if (c.getNome().equals(nome)) {
				System.out.println("Contato excluído");
				contatos.remove(i);
			}
		}
	}
	
	public Contato buscarContato(String nome) throws Exception {
		int tamanho = contatos.size();
		for (int i = 0; i < tamanho; i++) {
			Contato c = contatos.get(i);
			if (c.getNome().equals(nome)) {
				return c;
			}
		}
		throw new Exception("Valor não encontrado");
		}

}
