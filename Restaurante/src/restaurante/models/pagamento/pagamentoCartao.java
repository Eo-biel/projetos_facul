package restaurante.models.pagamento;

public class pagamentoCartao implements pagamento {
	 private String bandeira;
	 private String ultimosDigitos;
	 private boolean aprovado;
	 private int parcelas;
	    
	    public void PagamentoCartao(String bandeira, String ultimosDigitos, int parcelas) {
	        this.bandeira = bandeira;
	        this.ultimosDigitos = ultimosDigitos;
	        this.parcelas = parcelas;
	        this.aprovado = false;
	    }
	    
	    @Override
	    public void processarPagamento(double valor) {
	        System.out.printf("Processando pagamento de R$%.2f no cartão %s final %s\n", 
	            valor, bandeira, ultimosDigitos);
	        
	        if (parcelas > 1) {
	            System.out.printf("Pagamento em %d parcelas de R$%.2f\n", 
	                parcelas, valor / parcelas);
	        }
	        
	        // Simulação de aprovação
	        this.aprovado = true;
	        System.out.println("Pagamento aprovado!");
	    }
	    
	    @Override
	    public String getTipoPagamento() {
	        return "Cartão " + bandeira;
	    }
	    
	    @Override
	    public boolean isAprovado() {
	        return aprovado;
	    }

}
