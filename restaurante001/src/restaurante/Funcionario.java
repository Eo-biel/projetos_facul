package restaurante;

public class Funcionario extends Pessoa {
	
	private String Cod_funcionario;
	private String Cargo;
	
	public String getCod_funcionario() {
		return Cod_funcionario;
	}
	
	public void setCod_funcionario(String cod_funcionario) {
		if(Cod_funcionario.matches("\\d{2}[A-Za-z]"))
		Cod_funcionario = cod_funcionario;
	}
	
	public String getCargo() {
		return Cargo;
	}
	
	public void setCargo(String cargo) {
		Cargo = cargo;
	}
	
	public void put(String cod_funcionario2, Funcionario funcionario) {
	
		
	}
	

}
