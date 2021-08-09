import java.util.Scanner;

public class OperacoesConta extends Conta {
	public static void main(String[] args) {
		 int ag, cc, digito;
		 String nome;
		 double saldo = 1000;
		 
	Conta c1;
	c1 = new Conta();

	c1.setSaldo(saldo);
	
	Scanner valor = new Scanner(System.in);
	int opcao = 0;
	
	System.out.println("Digite seu nome:");
	nome = valor.next();
	c1.setNome(nome);
	System.out.println("Digite sua Agencia");
	ag = valor.nextInt();
	c1.setAg(ag);
	System.out.println("Digite sua Conta Corrente");
	cc = valor.nextInt();
	c1.setCc(cc);
	
		while(opcao != 4) {
			System.out.println("Digite qual opção deseja seguir: ");
			System.out.println("1 - Extrato");
			System.out.println("2 - Depósito");
			System.out.println("3 - Saque");
			System.out.println("4 - Finalizar");
			opcao = valor.nextInt();
			switch(opcao) {
			case 1:
				opcao = 1;
				System.out.println("-----------------------------------------------------------");
				System.out.println("");
				System.out.println("*************************EXTRATO***************************");
				System.out.println(c1.exibir());
				System.out.println("-----------------------------------------------------------");
				System.out.println("");
				break;
			case 2:
				opcao = 2;
				System.out.println("-----------------------------------------------------------");
				System.out.println("");
				System.out.println("************************DEPÓSITO****************************");
				System.out.println("");
				System.out.printf("Digite o valor a ser depositado: R$ ");
				double depositar = valor.nextDouble();
				c1.deposito(depositar);
				System.out.println("-----------------------------------------------------------");
				System.out.println("");
				break;
			case 3:
				opcao = 3;
				double saque;
				System.out.println("-----------------------------------------------------------");
				System.out.println("");
				System.out.println("**************************SAQUE****************************");
				System.out.println("");
				System.out.printf("Digite o valor a ser sacado: R$ ");
				saque = valor.nextDouble();
				c1.saque(saque);
				System.out.println("-----------------------------------------------------------");
				System.out.println("");
				break;
			case 4:
				opcao = 4;
				System.out.println("-----------------------------------------------------------");
				System.out.println("-----------------------------------------------------------");
				System.out.printf("Operação Finalizada!!! ");
				System.out.println("-----------------------------------------------------------");
				System.out.println("-----------------------------------------------------------");

				break;
			default:
				System.out.println("Error");
			}
		}
	}
	
}

