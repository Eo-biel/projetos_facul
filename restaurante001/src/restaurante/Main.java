package restaurante;

public class Main {

	public static void main(String[] args) {
		
		Rep_cliente rep_cliente = new Rep_cliente();
		Rep_funcionario rep_funcionario = new Rep_funcionario();		
		
	
		  Cliente cliente = new Cliente();
	        cliente.setNome("Gabriel");
	        cliente.setCpf("12345678900");
	        cliente.setTelefone("81999999999");
	        rep_cliente.adicionar(cliente);

	        Funcionario funcionario = new Funcionario();
	        funcionario.setNome("Paula");
	        funcionario.setCargo("Garçom");
	        rep_funcionario.adicionar(funcionario);
	       
	        pagamento Pagamento = new pagamento();

	        Pagamento.setId_pagamento(101);
	        Pagamento.setValor_total(75.50);
	        Pagamento.setTipo_pagamento("PIX");

	        Pagamento.realizar_pagamento();
	      
	       
	}

}
