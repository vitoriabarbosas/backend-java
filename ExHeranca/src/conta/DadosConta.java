package conta;

public class DadosConta {
		protected String nomeTitular;
		protected String cpf;
		protected int numconta;
		protected float saldo;
				
		public DadosConta(String nomeTitular, String cpf, int numconta, float saldo) {
			super();
			this.nomeTitular = nomeTitular;
			this.cpf = cpf;
			this.numconta = numconta;
			this.saldo = saldo;
		}

		public String getNomeTitular() {
			return nomeTitular;
		}

		public void setNomeTitular(String nomeTitular) {
			this.nomeTitular = nomeTitular;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public int getNumconta() {
			return numconta;
		}

		public void setNumconta(int numconta) {
			this.numconta = numconta;
		}

		public float getSaldo() {
			return saldo;
		}

		public void setSaldo(float saldo) {
			this.saldo = saldo;
		}
		
		


}
