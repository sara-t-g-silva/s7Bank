package s7Bank;

	public class testeMetodos {
		
		public static void main (String[]args) {
			
			Conta contaTeste = new Conta();
			
			Conta contaTeste2 = new Conta();
			
			contaTeste.saldo = 100;
			contaTeste2.saldo = 1000;
			
			System.out.println("saldo conta teste  " + contaTeste.saldo);
			System.out.println("saldo conta teste 2  " +contaTeste2.saldo);
			
			var sucessoTransferencia = contaTeste.transfere2(200, contaTeste2);
			
			if(sucessoTransferencia) {
				System.out.println("Trasferencia efetivada");
			}else {
				System.out.println("faltou dinheiro");
			}
			
			System.out.println("saldo conta teste depois da transferencia" +contaTeste.saldo);
			
			System.out.println("saldo conta teste 2 depois da transferencia"+contaTeste2.saldo);
			
			
		}

	}
