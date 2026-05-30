package restaurante;

public class Cliente extends Pessoa {
	
	private String cod_Cliente;

	public String getCod_Cliente() {
		return cod_Cliente;
	}

	public void setCod_Cliente(String cod_Cliente) {
		if(cod_Cliente.matches("\\d{3}[A-Za-z]"))
		this.cod_Cliente = cod_Cliente;
	}

	public void put(String cpf, Cliente cliente) {
		
	}
	
	

}
