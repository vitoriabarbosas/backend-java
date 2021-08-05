import java.util.Scanner;

public class EmpregadoTeste {

	String nome, cargo;
	double salario;
	
	void dados() {
		System.out.println("Insira seu nome: ");
		Scanner valor = new Scanner(System.in);
		nome = valor.next();	
		System.out.println("Insira seu cargo: ");
		Scanner valor1 = new Scanner(System.in);
		cargo = valor1.next();
		System.out.println("Insira sua média salarial: ");
		Scanner valor2 = new Scanner(System.in);
		salario = valor2.nextDouble();
		}
	
	public void aumentarsalario(double percentual) {
		double aumento;
		aumento = (percentual/100)*salario;
		salario = salario + aumento; 
		System.out.println("Aumento salarial de: "+aumento+ "%");
	}
	
	void imprimir() {
		System.out.println("--------------------------------------");
		System.out.println("Nome: "+nome);
		System.out.println("Cargo: "+cargo);
		System.out.println("Salário mensal: "+salario);
		
	}


}
