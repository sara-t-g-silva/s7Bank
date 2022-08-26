package s7Bank;

public class criarConta {
	
	public static void main (String [] args) {
		
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 200.00;
		
		System.out.println(primeiraConta.saldo);
		primeiraConta.saldo += 100.00; 
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		
		segundaConta.saldo = 50.00;
		System.out.println(segundaConta.saldo);
		
	}

}
