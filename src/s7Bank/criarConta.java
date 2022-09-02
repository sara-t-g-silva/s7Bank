package s7Bank;

public class criarConta {
	
	public static void main (String [] args) {
		
		Conta primeiraConta = new Conta(050,1234);
		
		primeiraConta.deposita(200);
		
		System.out.println(primeiraConta.getSaldo());
		primeiraConta.deposita(100); 
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = new Conta(050,1112); // necessario passar parametro exigido no construtor.
		
		segundaConta.deposita(50);
		System.out.println(segundaConta.getSaldo());
		
	}

}
