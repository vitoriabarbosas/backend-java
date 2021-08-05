
public class Carro {
	String marca, modelo, cor;
	int ano;
	double preco;
	
	void exibitInfo() {
	System.out.println("Autom�vel: "+marca+ " - " +modelo);
	System.out.println("      Ano: "+ano);
	System.out.println("      Cor: " +cor);
	System.out.println("    Pre�o: " +preco);
	}

	void aplicarDesconto(double percentual) {
		preco = preco - (percentual/100)*preco;
		System.out.println(" Desconto: -" +percentual);
		System.out.println("----------------------------------");
		System.out.println(" Pre�o com desconto: " +preco);
	}
	
	double ipva() {
		double valoripva;
		if (ano < 2000) {
			valoripva = 0;
		}
		else {
			valoripva = preco * 0.02;
		} 
		return valoripva;
	}
}
