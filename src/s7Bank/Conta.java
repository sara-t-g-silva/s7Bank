package s7Bank;

	public class Conta {

		private double saldo;
		private int agencia;
		private int numero;
		private Cliente titular; //adicionando atributo do tipo Cliente, cria uma flexa para o objeto cliente;
		private static int total =0; // static se refere a class Conta;
		
		
		public Conta(int agencia, int numero) {
			Conta.total++;
			this.agencia = agencia;
			this.numero = numero;
			//this.saldo = 100; // toda conta inicia com valor de 100.
			
			//System.out.println("Adicionando uma conta!");
			
		}
		
		public void deposita(double valor) {
			this.saldo += valor; 
		}
		public boolean saca(double valor) {
			if(this.saldo>=valor) {
				saldo-=valor;
				return true;
			}else {
				return false;
			}
		}
//		public boolean transfere(double valor, Conta destino) {
//			if(this.saldo>=valor) {
//				this.saldo-=valor;
//				destino.deposita(valor);
//				return true;
//			}else {
//				return false;
//			} 
//		}
		public boolean transfere2(double valor, Conta destino) {
			if(this.saldo>=valor) {
				saca(valor); // reciclagem do metodo saca
				destino.deposita(valor); // reciclagem do metodo deposita
				return true;
			}
				return false;
		}
		
		public double getSaldo() { //get metodo com retorno de resposta, saldo
			return this.saldo;
		}
		
		public int getNumero() {
			return this.numero;
		}
		
		public void setNumero(int numero) {
			this.numero = numero; // numero em azul atributo da conta, nnumero em roxo, variável temporária do método setNumero.
		}
		
		public int getAgencia() {
			return this.agencia;
		}
		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}
		
		public Cliente getTitular() {
			return this.titular;
		}
		public void setTitular(Cliente titular) {
			this.titular = titular;
		}
		
		public static int getTotal() {
			return Conta.total;
		}
			
		}
	
	
