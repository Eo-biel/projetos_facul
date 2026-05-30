package restaurante;

import java.util.HashMap;
import java.util.Map;

public class Rep_cliente {

	private Map<String, Cliente > clientes;
	
	public Rep_cliente() {
		clientes = new HashMap<>();
		
	}
	
	public void adicionar(Cliente cliente) {
		cliente.put(cliente.getCpf(),cliente);
	}
	
	public Cliente buscar(String cpf) {
		return clientes.get(cpf);
		
	}
	
	public void remove(String cpf) {
		clientes.remove(cpf);
	}
	
	public void listar() {
		for (Cliente c : clientes.values()) {
			System.out.println("Nome: " + c.getNome());
			System.out.println("CPF: " + c.getCpf());
			System.out.println("Codigo do cliente: " + c.getCod_Cliente());
		}
	}
	
}
