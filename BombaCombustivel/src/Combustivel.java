import java.util.Scanner;

public class Combustivel {
	public static void main(String[] args) {
		String nome=null; 
		double preco=0, litro=0, qtd=0;
		Operacoes c1;
		c1 = new Operacoes(nome, litro, qtd, preco);
		
		System.out.println("Digite o nome do combustível: ");
		Scanner valor = new Scanner(System.in);
		nome = valor.next();
		c1.setNome(nome);
		
		System.out.printf("Qual o preço do abastescimento por litro? R$  ");
		preco = valor.nextDouble();
		c1.AbastecerporPreco(preco);
		c1.setPrecoLitro(preco);
		
		System.out.println("Digite a quantidade desejada de litros a abastecer:  ");
		qtd = valor.nextDouble();
		c1.AbastescerporLitro(qtd);
		
		System.out.println(c1.exibir());
		
	}

}
