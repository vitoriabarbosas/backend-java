
public class Loja {
	public static void main(String[] args) {
		Carro c1;
		c1 = new Carro();
		c1.ano = 2021;
		c1.cor = "Preto";
		c1.marca = "Renault";
		c1.modelo = "Sandero";
		c1.preco = 60000;
		
		//exibindo o anuncio
		c1.exibitInfo();
		c1.aplicarDesconto(30);
		double valoripva = c1.ipva();
		System.out.println(" IPVA: R$ "+valoripva);
	}	
}

