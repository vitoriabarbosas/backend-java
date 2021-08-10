package core;

public class Horista extends Funcionario {
	
	private double valorHora;
	private double numeroHoras;
	
	public Horista(int registro, String nome, double valorHora, double numeroHoras) {
		super(registro, nome);
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}

	public double calcularSalario() {
		return valorHora*numeroHoras;
	}
	
	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(double numeroHoras) {
		this.numeroHoras = numeroHoras;
	}
	
	
	

}
