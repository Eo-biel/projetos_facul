package encap;

public class pagamento extends Funcionario{

	private int valor_total;
	private boolean status_pag;
	
	public int getValor_total() {
		return valor_total;
	}
	
	public void setValor_total(int valor_total) {
		this.valor_total = valor_total;
	}
	
	public boolean isStatus_pag() {
		return status_pag;
	}
	
	public void setstatus_pag(boolean status_pag){
		this.status_pag = status_pag;
		
	}
	
	public void comprovante() {
		if(status_pag) {
			System.out.println("pagamento aprovado");
			System.out.println("valor pago: R$" + valor_total);
			System.out.println("comprovante gerado");

		}
		else {System.out.println("pagamento recusado, tente novamente ou selecione outro meio de pagamento");
		
		}
	}
}
