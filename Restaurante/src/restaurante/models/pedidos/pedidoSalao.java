package restaurante.models.pedidos;

import restaurante.models.pessoas.*;

public class pedidoSalao extends pedidos {
    private int numeroMesa;
    private garcom garcomResponsavel;
    
    public void pedidoSalao(cliente cliente, int numeroMesa, garcom garcom) {
        super(cliente);
        this.numeroMesa = numeroMesa;
        this.garcomResponsavel = garcom;
    }
    
    @Override
    public void entregar() {
        atualizarStatus("Entregue na mesa " + numeroMesa);
        System.out.println("Pedido entregue diretamente ao cliente na mesa.");
        garcomResponsavel.adicionarGorjeta(calcularTaxaEntrega());
    }
    
    @Override
    public double calcularTaxaEntrega() {
        return 0.0; // Sem taxa para pedidos no salão
    }
    
    public int getNumeroMesa() { return numeroMesa; }
    public garcom getGarcomResponsavel() { return garcomResponsavel; }
}

