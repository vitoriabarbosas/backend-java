import java.util.Scanner;

public class Empregado {
	public static void main(String[] args) {
		double porcento;
		EmpregadoTeste f1;
		f1 = new EmpregadoTeste();
		
		f1.dados();
		
		System.out.println("Digite a porcentagem (%) de acr�scimo salarial desejado: ");
		Scanner valor = new Scanner(System.in);
		porcento = valor.nextDouble();
		
		f1.aumentarsalario(porcento);
		f1.imprimir();
		
	}
	
	
	
	
}
