package view;

import model.AgendaTelefonica;
import model.Contato;

public class Principal {

	public static void main(String[] args) {
		Contato c1 = new Contato();
		c1.setNome("Fulano");
		c1.setTelefone("11911111111");
		c1.setEmail("fulaninho@email.com");
		
		Contato c2 = new Contato();
		c2.setNome("Siclano");
		c2.setTelefone("11911111112");
		c2.setEmail("siclaninho@email.com");
		
		Contato c3 = new Contato();
		c3.setNome("Beltrano");
		c3.setTelefone("11911111113");
		c3.setEmail("beltraninho@email.com");
		
		AgendaTelefonica ag = new AgendaTelefonica();
		try {
			ag.adicionarContato(c1);
			ag.adicionarContato(c2);
			ag.adicionarContato(c3);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		Contato c = new Contato();
		try {
			c = ag.buscarContato("Beltrano");
			System.out.println("Nome: "+c.getNome()+" | Telefone: "+c.getTelefone()+" | E-mail: "+c.getEmail());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		try {
			ag.removerContato("Beltrano");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		try {
			c = ag.buscarContato("Beltrano");
			System.out.println("Nome: "+c.getNome()+" | Telefone: "+c.getTelefone()+" | E-mail: "+c.getEmail());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
