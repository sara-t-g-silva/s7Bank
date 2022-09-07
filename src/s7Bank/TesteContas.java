package s7Bank;

public class TesteContas {
	
	public static void main (String []args ) {
		
		ContaCorrente cc = new ContaCorrente(111, 1111);
		ContaPoupanca cp = new ContaPoupanca(222, 2222);
		
		cc.deposita(200.0); // chamada do método herdado da class Conta;
		
		cp.deposita(100.0);
		
		cc.transfere2(10, cp);
		
	
		
		System.out.println("saldo conta corrente:" + cc.getSaldo());
		System.out.println("saldo conta poupanca:" + cp.getSaldo());
		
	}

}
