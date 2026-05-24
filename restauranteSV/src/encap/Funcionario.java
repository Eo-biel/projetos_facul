package encap;

public class Funcionario extends Cliente{

	private String codfuncionario; {
		

	}


	public String getCodfuncionario() {
		return codfuncionario;
	}


	public void setCodfuncionario(String codfuncionario) {
		 if(codfuncionario.matches("\\d{2}[A-Za-z]"))
		this.codfuncionario = codfuncionario;
	}

}
