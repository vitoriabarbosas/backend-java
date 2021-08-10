package core;

public abstract class Funcionario {

	protected int registro;
	protected String nome;
	
	public Funcionario(int registro, String nome) {
		super();
		this.registro = registro;
		this.nome = nome;
	}
	
	//Classes filhas são obigadas a implementar
	public abstract double calcularSalario();
	
	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
