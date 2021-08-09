import java.util.Scanner;

public class Conta {
	private int ag, cc, digito;
	private String nome;
	private double saldo = 1000;
	
	
	
	public String exibir() {
		return "Conta " +cc+ "-" +digito+ "\n"+
				"Titular: " +nome+ "\n"+ "Saldo: R$ " +saldo;
	}
	
	public void deposito(double saldo) {
		if(saldo < this.saldo) {
			this.saldo = saldo + this.saldo;
			System.out.println("Operação depósito realizado! \n Saldo: R$ "+this.saldo);
			
		}
		else {
			System.out.println("Operação depósito finalizada");
		} 
	}
	
	public void saque(double valor) {
		if(valor < this.saldo) {
			this.saldo = this.saldo - valor;
			System.out.println("Saque realizado! Seu saldo é de: R$ "+this.saldo);
		}
		else {
			System.out.println("Valor indisponível :/");
		}
	}

	public int getAg() {
		return ag;
	}

	public void setAg(int ag) {
		this.ag = ag;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public int getDigito() {
		return digito;
	}

	public void setDigito(int digito) {
		this.digito = digito;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
