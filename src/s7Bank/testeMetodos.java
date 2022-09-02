package s7Bank;

	public class testeMetodos {
		
		public static void main (String[]args) {
			
			Conta contaTeste = new Conta(050,1123);
			
			Conta contaTeste2 = new Conta(050,1133);
			
			contaTeste.deposita(100);
			contaTeste2.deposita(1000);
			
			System.out.println("saldo conta teste  " + contaTeste.getSaldo());
			System.out.println("saldo conta teste 2  " +contaTeste2.getSaldo());
			
			var sucessoTransferencia = contaTeste.transfere2(200, contaTeste2);
			
			if(sucessoTransferencia) {
				System.out.println("Trasferencia efetivada");
			}else {
				System.out.println("faltou dinheiro");
			}
			
			System.out.println("saldo conta teste depois da transferencia" +contaTeste.getSaldo());
			
			System.out.println("saldo conta teste 2 depois da transferencia"+contaTeste2.getSaldo());
			
			
		}

	}
