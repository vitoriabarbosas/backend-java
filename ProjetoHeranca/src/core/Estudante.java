package core;

public class Estudante extends Pessoa {
	private int matricula;
	private String curso;
	
	public void exibir() {
		System.out.println("Estudante: "+getNome()+ "Email: "+getEmail()+ "Matrícula: "+matricula);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	 
}
