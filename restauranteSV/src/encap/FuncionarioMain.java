package encap;
//funcionario herda clientes
public class FuncionarioMain {

	public static void main(String[] args) {
		Funcionario p = new Funcionario();
		p.setCodfuncionario("31b");
		p.setNome("marlon");
		p.setNumcomanda("038");
		System.out.println(p.getNome());
		System.out.println("codigo do funcionario:" + p.getCodfuncionario());
		
	}

}
