package restaurante.models.pagamento;

public class pagamentoPix implements pagamento {
	private String chavePix;
    private String qrCode;
    private boolean aprovado;
    
    public void PagamentoPix(String chavePix) {
        this.chavePix = chavePix;
        this.qrCode = "QRCODE_" + System.currentTimeMillis();
        this.aprovado = false;
    }
    
    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Gerando PIX no valor de R$%.2f\n", valor);
        System.out.println("Chave: " + chavePix);
        System.out.println("QR Code: " + qrCode);
        System.out.println("Aguardando confirmação do PIX...");
        
        // Simulação
        this.aprovado = true;
        System.out.println("Pagamento via PIX confirmado!");
    }
    
    public String getQrCode() { return qrCode; }
    
    @Override
    public String getTipoPagamento() {
        return "PIX";
    }
    
    @Override
    public boolean isAprovado() {
        return aprovado;
    }

}
