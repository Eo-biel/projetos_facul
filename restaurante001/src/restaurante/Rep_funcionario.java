package restaurante;

import java.util.HashMap;
import java.util.Map;

public class Rep_funcionario {
	
	private Map<Integer, Funcionario> funcionario; 
	
	public Rep_funcionario() {
		funcionario = new HashMap<>();
		
	}
	
	public void adicionar(Funcionario funcionario) {
		funcionario.put(funcionario.getCod_funcionario(),funcionario);
		
	}
	
	public Funcionario buscar(String Cod_funcionario) {
		return funcionario.get(Cod_funcionario);
		
	}
	
	public void remover(String Cod_funcionario) {
		funcionario.remove(Cod_funcionario);
		
	}
	
	public void listar() {
		
	for (Funcionario f : funcionario.values()) {
		System.out.println("Nome: " + f.getNome());
		System.out.println("Cargo: " + f.getCargo());
	}
		
	}
	
	
	
	
}
