package s7Bank;

public class ContaCorrente extends Conta {
	 
	public ContaCorrente(int agencia, int numero) { // herda tudo da class Conta, menos os construtores que são necessário declarar.
		super(agencia, numero);											// cada construtor é exclusivo para cada class, mas como a class é filha da class Conta, tem que ser passado o construtor com as mesmas assinaturas.
		
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

	
	public void deposita(double valor) {
		super.saldo += valor; // necessário chamar o saldo da super class;
	}
}
