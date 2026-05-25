package restaurante.models.pedidos;

import java.util.*;
import restaurante.models.pessoas.cliente;

public abstract class pedidos {

    protected int numeroPedido;
    protected cliente cliente;
    protected Map<String, Double> itens;
    protected String status;
    protected Date dataHora;
    protected double valorTotal;

    private static int contadorPedidos = 0;

    public void Pedidos(cliente cliente) {
        this.numeroPedido = ++contadorPedidos;
        this.cliente = cliente;
        this.itens = new HashMap<>();
        this.status = "Recebido";
        this.dataHora = new Date();
        this.valorTotal = 0;
    }

    public void adicionarItem(String nomeItem, double preco) {
        itens.put(nomeItem, preco);
        calcularValorTotal();
        System.out.println("Item adicionado: " + nomeItem + " - R$" + preco);
    }

    private void calcularValorTotal() {
        this.valorTotal = itens.values().stream().mapToDouble(Double::doubleValue).sum();
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
        System.out.println("Pedido #" + numeroPedido + " agora está: " + novoStatus);
    }

    // Getters
    public int getNumeroPedido() {
        return numeroPedido;
    }

    public cliente getCliente() {
        return cliente;
    }

    public String getStatus() {
        return status;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public Map<String, Double> getItens() {
        return itens;
    }

    // Método abstrato - polimorfismo
    public abstract void entregar();

    public abstract double calcularTaxaEntrega();

    public void exibirPedido() {
        System.out.println("\n=== PEDIDO #" + numeroPedido + " ===");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Data: " + dataHora);
        System.out.println("Status: " + status);
        System.out.println("Itens:");
        for (Map.Entry<String, Double> item : itens.entrySet()) {
            System.out.printf("  - %s: R$%.2f\n", item.getKey(), item.getValue());
        }
        System.out.printf("Total: R$%.2f\n", valorTotal);
        System.out.printf("Taxa entrega: R$%.2f\n", calcularTaxaEntrega());
        System.out.printf("Valor final: R$%.2f\n", valorTotal + calcularTaxaEntrega());
    }
}