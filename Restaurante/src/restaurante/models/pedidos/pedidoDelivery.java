package restaurante.models.pedidos;

import restaurante.models.*;
import restaurante.models.pessoas.*;
import restaurante.models.pagamento.*;
import restaurante.models.pedidos.*;

public class pedidoDelivery extends pedidos {
    private endereco enderecoEntrega;
    private String motoboy;
    private double distanciaKm;
    
    public pedidoDelivery(cliente cliente, endereco endereco, double d) {
		// TODO Auto-generated constructor stub
	}

	public void pedidoDelivery(cliente cliente, endereco enderecoEntrega, double distanciaKm) {
        super(cliente);
        this.enderecoEntrega = enderecoEntrega;
        this.distanciaKm = distanciaKm;
        this.motoboy = null;
    }
    
    public void atribuirMotoboy(String nomeMotoboy) {
        this.motoboy = nomeMotoboy;
        System.out.println("Motoboy " + nomeMotoboy + " atribuído ao pedido #" + numeroPedido);
    }
    
    @Override
    public void entregar() {
        if (motoboy == null) {
            System.out.println("Erro: Nenhum motoboy atribuído ao pedido!");
            return;
        }
        atualizarStatus("Saiu para entrega com " + motoboy);
        System.out.println("Entregando no endereço: " + enderecoEntrega);
        atualizarStatus("Entregue com sucesso!");
    }
    
    @Override
    public double calcularTaxaEntrega() {
        // Taxa base: R$5,00 + R$2,00 por km
        return 5.00 + (distanciaKm * 2.00);
    }
    
    public endereco getEnderecoEntrega() { return enderecoEntrega; }
    public String getMotoboy() { return motoboy; }
}