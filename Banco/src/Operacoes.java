import java.util.Scanner;

public class Operacoes {
	int ag, cc, digito;
	String nome;
	double saldo = 1000;
	
	void opcoes() {
		int opcao = 0;
		while(opcao != 4) {
			System.out.println("Digite qual opção deseja seguir: ");
			System.out.println("1 - Extrato");
			System.out.println("2 - Depósito");
			System.out.println("3 - Saque");
			System.out.println("4 - Finalizar");
			Scanner valor = new Scanner(System.in);
			opcao = valor.nextInt();
			
			switch(opcao) {
			case 1:
				opcao = 1;
				System.out.println("-----------------------------------------------------------");
				System.out.println("");
				imprimir();
				System.out.println("-----------------------------------------------------------");
				System.out.println("");
				break;
			case 2:
				opcao = 2;
				System.out.println("-----------------------------------------------------------");
				System.out.println("");
				deposito(saldo);
				System.out.println("-----------------------------------------------------------");
				System.out.println("");
				break;
			case 3:
				opcao = 3;
				double saque;
				System.out.println("-----------------------------------------------------------");
				System.out.println("");
				System.out.printf("Digite o valor a ser sacado: R$ ");
				Scanner valor1 = new Scanner(System.in);
				saque = valor1.nextDouble();
				saque(saque);
				System.out.println("-----------------------------------------------------------");
				System.out.println("");
				break;
			case 4:
				opcao = 4;
				break;
			default:
				System.out.println("Error");
			}
		}
	}
	
	void dados(){	
		System.out.println("Insira seu nome ou como você gostaria de ser chamado: ");
		Scanner valor = new Scanner(System.in);
		nome = valor.next();
		System.out.println("Agencia: ");
		Scanner valor1 = new Scanner(System.in);
		ag = valor1.nextInt();
		System.out.println("Conta Corrente: ");
		Scanner valor2 = new Scanner(System.in);
		cc = valor2.nextInt();
		System.out.println("Digito: ");
		Scanner valor3 = new Scanner(System.in);
		digito = valor3.nextInt();
		
		System.out.println();
		System.out.println();
		
		}
	
	void imprimir() {
		if(ag== 1234 && cc == 123 && digito == 12) {
		System.out.println("Nome: "+nome);
		System.out.println("CPF: 123.123.123-12");
		System.out.println("Agencia: "+ag);
		System.out.println("Conta Corrente: "+cc);
		System.out.println("Digito: "+digito);
		System.out.println("Saldo: R$ "+saldo);
		}
		
		else { 
		System.out.println("Error! :/ ");  
		}
	}
	
	void deposito(double saldo) {
		String depo;
		double depositar;
		System.out.println("Seu saldo atual é: R$ "+saldo);
		System.out.println("Gostaria de realizar um depósito? Digite 'Sim' para continuar");
		Scanner valor = new Scanner(System.in);
		depo = valor.next();
		if(depo == "Sim") {
			System.out.println("Digite o valor a ser depositado: ");
			Scanner valor1 = new Scanner(System.in);
			depositar = valor1.nextDouble();
			saldo = saldo + depositar;
			System.out.println("Valor depositado com sucesso! Saldo atual:  "+saldo);
		}
		else {
			System.out.println("Operação depósito finalizada");
		}
	}
	
	void saque (double valor) {
		double saque;
		saque = valor;
			if(saque < saldo) {
				saldo = saldo - saque;
				System.out.println("Saque realizado com sucesso!");
				System.out.println("Saldo Atual: R$ "+saldo);
			}
			else {
				System.out.println("Valor indisponível para saque");
			}
	}
	
}
