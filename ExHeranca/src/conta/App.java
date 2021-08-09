package conta;

public class App extends Operacoes{
	
	public App(String nomeTitular, String cpf, int numconta, float saldo) {
		super(nomeTitular, cpf, numconta, saldo);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String nome, cpf;
		int conta, saldoconta;
				
		Operacoes o = new Operacoes("Vitória", "123456789-10", 2021, 1000); 
		
		System.out.println(o.extrato());
		o.depositar(20);
		System.out.println(o.extrato());
		o.sacar(10);
		System.out.println(o.extrato());
		
	}

}
