package restaurante;

import restaurante.models.*;
import restaurante.models.pedidos.*;
import restaurante.models.pessoas.*;
import restaurante.models.pagamento.*;

public class main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DO RESTAURANTE ===\n");
        
        // Criando endereço
        endereco endereco = new endereco("Rua das Flores", "123", 
            "Centro", "São Paulo", "01001-000");
        
        // Criando cliente
        cliente cliente = new cliente("Maria Silva", "123.456.789-00", 
            "(11) 99999-8888", "maria@email.com");
        
        // Criando funcionários
        garcom garcom = new garcom("Carlos Santos", "111.222.333-44", 
            "(11) 98888-7777", "carlos@restaurante.com", 
            "G001", 2000.00, "Noturno");
        
        cozinheiro cozinheiro = new cozinheiro("Ana Paula", "555.666.777-88",
            "(11) 97777-6666", "ana@restaurante.com",
            "C001", 3500.00, "Integral", "Carnes");
        
        caixa caixa = new caixa("Roberto Lima", "999.888.777-66",
            "(11) 96666-5555", "roberto@restaurante.com",
            "X001", 2500.00, "Noturno");
        
        // Estabelecendo hierarquia (gerenciamento)
        System.out.println("\n--- Definindo supervisores ---");
        caixa.setSupervisor(garcom);
        cozinheiro.setSupervisor(caixa);
        
        // Trabalhando
        System.out.println("\n--- Rotina de trabalho ---");
        garcom.trabalhar();
        cozinheiro.trabalhar();
        caixa.trabalhar();
        
        // Criando pedido
        System.out.println("\n--- Novo Pedido ---");
        pedidos pedido = new pedidoSalao(cliente, 10, garcom);
        pedido.adicionarItem("Picanha com fritas", 65.00);
        pedido.adicionarItem("Suco de laranja", 12.00);
        pedido.adicionarItem("Pudim de leite", 15.00);
        
        pedido.exibirPedido();
        
        // Preparando e entregando
        cozinheiro.prepararPrato("Picanha com fritas");
        pedido.entregar();
        
        // Registrando pontos de fidelidade
        cliente.adicionarPontos((int) pedido.getValorTotal());
        
        // Processando pagamento
        System.out.println("\n--- Pagamento ---");
        pagamento pagamento = new pagamentoCartao("Visa", "1234", 3);
        pagamento.processarPagamento(pedido.getValorTotal() + pedido.calcularTaxaEntrega());
        
        caixa.registrarPagamento(pedido.getValorTotal());
        
        // Criando pedido delivery
        System.out.println("\n--- Pedido Delivery ---");
        pedidos pedidoDelivery = new pedidoDelivery(cliente, endereco, 5.5);
        pedidoDelivery.adicionarItem("Pizza Margherita", 45.00);
        pedidoDelivery.adicionarItem("Coca-Cola 2L", 12.00);
        
        ((pedidoDelivery) pedidoDelivery).atribuirMotoboy("José Entregador");
        pedidoDelivery.exibirPedido();
        pedidoDelivery.entregar();
        
        // Pagamento via PIX
        pagamento pagamentoPix = new pagamentoPix("maria@email.com");
        pagamentoPix.processarPagamento(pedidoDelivery.getValorTotal() + pedidoDelivery.calcularTaxaEntrega());
        caixa.registrarPagamento(pedidoDelivery.getValorTotal());
        
        // Exibindo salários dos funcionários (polimorfismo)
        System.out.println("\n--- Salários dos Funcionários ---");
        funcionario[] funcionarios = {garcom, cozinheiro, caixa};
        for (funcionario func : funcionarios) {
            func.apresentar();
            System.out.printf("Salário: R$%.2f\n", func.calcularSalario());
        }
        
        // Resumo final
        System.out.println("\n=== RESUMO DO DIA ===");
        cliente.apresentar();
        System.out.printf("Saldo em caixa: R$%.2f\n", caixa.getSaldoCaixa());
    }

}
