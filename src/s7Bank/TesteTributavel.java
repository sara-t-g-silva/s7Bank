package s7Bank;

public class TesteTributavel {
	
	public static void main(String []args) {
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		
		ContaCorrente cc = new ContaCorrente(222,222);
		
		cc.deposita(200.0);
		
		calc.registra(cc);
		
		System.out.println(calc.getTotalImposto());
		
	
	}

}
