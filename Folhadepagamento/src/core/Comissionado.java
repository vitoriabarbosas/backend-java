package core;

public class Comissionado extends Funcionario {
	
	private double salarioBase;
	private double comissao;
	
	public Comissionado(int registro, String nome, double salarioBase, double comissao) {
		super(registro, nome);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}
	
	public double calcularSalario() {
		return salarioBase + salarioBase*comissao/100;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	

}
