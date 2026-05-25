package restaurante.models.pagamento;

public interface pagamento {
	void processarPagamento(double valor);
    String getTipoPagamento();
    boolean isAprovado();

}
