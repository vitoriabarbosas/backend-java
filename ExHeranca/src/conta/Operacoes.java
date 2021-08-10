package conta;

public class Operacoes  extends DadosConta {
	
	public Operacoes(String nomeTitular, String cpf, int numconta, float saldo) {
		super(nomeTitular, cpf, numconta, saldo);
		// TODO Auto-generated constructor stub
	}

	float valor;  
	
	// debitar
	public float sacar(float valor) {
		float saldo;
		saldo = getSaldo() - valor;
		this.setSaldo(saldo);
		
		return saldo;
	}
	
	// creditar
	public float depositar(float valor) {
		float saldo;
		saldo = getSaldo() + valor;
		this.setSaldo(saldo);
		
		return saldo;
	}
	
	// extrato
	public String extrato() {
		String extrato = "----------------------------------- \n "+
						 "			Extrato PI BANK           \n "+
						 "----------------------------------- \n "+
						 "Titular: "+getNomeTitular()+ "\n"+
						 "Cpf: "+getCpf()+ "\n"+
						 "Conta: "+getNumconta()+ "\n"+
						 "Saldo: "+getSaldo()+ "\n"+
						 "-----------------------------------";
		return extrato;
		
		
	}

}
