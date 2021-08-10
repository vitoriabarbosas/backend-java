package core;

public class Empreiteiro extends Funcionario {
	
	private double valorEmpreita;

	public Empreiteiro(int registro, String nome, double valorEmpreita) {
		super(registro, nome);
		this.valorEmpreita = valorEmpreita;
	}
	
	public double calcularSalario() {
		return valorEmpreita;
	}
	

	public double getValorEmpreita() {
		return valorEmpreita;
	}

	public void setValorEmpreita(double valorEmpreita) {
		this.valorEmpreita = valorEmpreita;
	}
	
	

}
