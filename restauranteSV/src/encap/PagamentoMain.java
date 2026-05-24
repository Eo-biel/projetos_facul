package encap;

public class PagamentoMain {

	public static void main(String[] args) {
		 pagamento p = new pagamento(); 
		 p.setCodfuncionario("codigo do funcionario"+"38b");
		 p.setValor_total(124);
		 p.setNome("Claudio");
		 p.setstatus_pag(true);
		 p.comprovante();
		 
		 System.out.println(p.getValor_total());
		 System.out.println(p.getCodfuncionario());
		 System.out.println(p.getNome());
		 System.out.println(p.isStatus_pag());
		 
	}

}
