package encap;
 //cliente herda pessoas
public class ClienteMain extends Pessoas {
	public static void main(String[] args) {
		Cliente p = new Cliente();
		p.setNumcomanda("033");
		p.setNome("Claudio");
		p.setCpf("01234567891");
		p.setNumcasa(68);
		p.setRua("vinte e dois");
		p.setTelefone("8323459471");
		System.out.println(p.getNumcomanda());
		System.out.println(p.getNome());
		
		
		
	}
}
