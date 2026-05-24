package encap;
	//podemos dizer que são os dados pessoa
public class pessoaMain{  
	
	public static void main(String[] args) {
		Pessoas p = new Pessoas();
		p.setNome("Paula");
		p.setCpf("01234567891");
		p.setNumcasa(84);
		p.setRua("trinta e seis");
		p.setTelefone("8123456799");
		System.out.println(p.getNome());
	}

}
		
