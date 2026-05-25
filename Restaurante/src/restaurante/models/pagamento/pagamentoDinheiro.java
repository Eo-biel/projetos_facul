package restaurante.models.pagamento;

public class pagamentoDinheiro implements pagamento  {
	private double valorPago;
    private double troco;
    private boolean aprovado;
    
    public void PagamentoDinheiro(double valorPago) {
        this.valorPago = valorPago;
        this.aprovado = false;
    }
    
    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Pagamento em dinheiro: R$%.2f\n", valorPago);
        
        if (valorPago >= valor) {
            this.troco = valorPago - valor;
            System.out.printf("Troco: R$%.2f\n", troco);
            this.aprovado = true;
            System.out.println("Pagamento confirmado!");
        } else {
            System.out.println("Valor insuficiente! Pagamento não aprovado.");
            this.aprovado = false;
        }
    }
    
    public double getTroco() { return troco; }
    
    @Override
    public String getTipoPagamento() {
        return "Dinheiro";
    }
    
    @Override
    public boolean isAprovado() {
        return aprovado;
    }
}
