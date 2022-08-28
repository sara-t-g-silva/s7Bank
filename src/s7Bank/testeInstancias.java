package s7Bank;

public class testeInstancias {
	public static void main(String[] args) {
		Conta contaDaSara = new Conta();
		
		contaDaSara.titular = new Cliente(); // criando a instancia entre objeto Cliente e atributo titular;
		
		contaDaSara.titular.nome = "Sara";
		System.out.println(contaDaSara);
		System.out.println(contaDaSara.titular.nome);
	}
}
