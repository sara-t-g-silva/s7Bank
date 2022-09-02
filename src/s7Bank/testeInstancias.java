package s7Bank;

public class testeInstancias {
	public static void main(String[] args) {
		Conta conta = new Conta();
		Cliente cliente = new Cliente();
		//sem encapsulamento -> contaDaSara.titular = new Cliente(); // criando a instancia entre objeto Cliente e atributo titular;
		
		conta.getAgencia();
		System.out.println(conta.getAgencia());
		
		conta.setTitular(cliente);
		
		cliente.setCpf("12345678900");
		cliente.setNome("sara");
		cliente.setProfissao("programador");
		
		
		System.out.println(cliente.getCpf());
		System.out.println(cliente.getNome());
		System.out.println(cliente.getProfissao());
		
	
		
	}
}
