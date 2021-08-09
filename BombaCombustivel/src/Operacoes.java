
public class Operacoes {

	private String nome;
	private double precoLitro, qtdlitro, total;
	
	public Operacoes(String nome, double precoLitro, double qtdlitro, double total) {
		this.nome = nome; 
		this.precoLitro = precoLitro;
		this.qtdlitro = qtdlitro; 
		this.total = total;		
	}
	
	
	
	public void AbastescerporLitro(double qtdlitro) {
		this.qtdlitro = qtdlitro;
		this.total = qtdlitro*this.precoLitro;
	}
	
	public void AbastecerporPreco (double total) {
		this.total = total;
		this.qtdlitro = total/this.precoLitro;
	}
	
	public String exibir() {
		String recibo = " \n"+
						"------------------------------------\n"+
						"               RECIBO                \n"+
						"------------------------------------\n"+
						"Combustível: "+nome+
						"\nPreço Litro: R$ " + String.format("%.3f \n", precoLitro)+
						"Quantidade de Litros: " + String.format("%.3f \n", qtdlitro)+
						"Valor Total: R$ " +String.format("%.3f \n", total);
		return recibo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoLitro() {
		return precoLitro;
	}

	public void setPrecoLitro(double precoLitro) {
		this.precoLitro = precoLitro;
	}

	public double getQtdlitro() {
		return qtdlitro;
	}

	public void setQtdlitro(double qtdlitro) {
		this.qtdlitro = qtdlitro;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	
}
