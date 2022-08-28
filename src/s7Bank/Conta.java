package s7Bank;

	public class Conta {

		double saldo;
		int agencia;
		int numero;
		Cliente titular; // adicionando atributo do tipo Cliente, cria uma flexa para o objeto cliente;
		
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
		public boolean transfere(double valor, Conta destino) {
			if(this.saldo>=valor) {
				this.saldo-=valor;
				destino.deposita(valor);
				return true;
			}else {
				return false;
			} 
		}
		public boolean transfere2(double valor, Conta destino) {
			if(this.saldo>=valor) {
				saca(valor); // reciclagem do metodo saca
				destino.deposita(valor); // reciclagem do metodo deposita
				return true;
			}
				return false;
		}
			
		}
	
	
