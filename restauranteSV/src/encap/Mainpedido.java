package encap;

public class Mainpedido extends Funcionario{

	public static void main(String[] args) {
		pedido p = new pedido();
		p.setValor_total(240);
		
		System.out.println(p.getValor_total());
	}

}
