package encap;

public class Pessoas {

	private String nome;
	  private  String cpf;
	  private  String telefone;
	  private  String rua;
	  private  int numcasa;
	  
	  public String getNome() {
		  return nome;
	  }
	  
	  public void setNome(String nome) {
		  this.nome = nome;
	  }
	  
	  public String getCpf() {
		  return cpf;
	  }
	  
	  public void setCpf( String cpf) {
		  // aceita apenas 11 digitos
		  if(cpf.matches("\\d{11}")) { 
			  this.cpf = cpf;
		 }else {
			 System.out.println("CPF invalido");
		
		 }
	  }
	  
	  public String getTelefone() {
		  return telefone;
	  }
	  
	  public void setTelefone(String telefone) {
		  if(telefone.matches("\\d{10,11}")) {
			  this.telefone = telefone;
		 }else{
			 System.out.println("Telefone invalido");
		 }
	  }
	  
	  public String getRua() {
		  return rua;
	  }
	  
	  public void setRua(String rua) {
		  this.rua =rua;
	  }
	  
	  public int getNumcasa() {
		  return numcasa;
	  }
	  
	  public void setNumcasa(int numcasa) {
		  if(numcasa > 0)
		  this.numcasa =numcasa;
	   
   }
}
