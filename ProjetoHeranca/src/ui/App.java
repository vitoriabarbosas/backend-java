package ui;

import core.Estudante;
import core.Pessoa;

public class App {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		p.setNome("Vitoria"); 
		p.setEmail("vitoria@email");
		p.exibir();
		
		Estudante e = new Estudante ();
		e.setMatricula(1234);
		e.setCurso("telecom");
		e.setNome("vitoria");
		e.setEmail("vitoria@email.com");
		e.exibir();
	}

}
