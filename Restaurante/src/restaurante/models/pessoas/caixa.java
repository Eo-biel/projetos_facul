package restaurante.models.pessoas;

public class caixa extends funcionario {
    private double saldoCaixa;
    private int transacoesRealizadas;
    
    public void Caixa(String nome, String cpf, String telefone, String email,
                String matricula, double salarioBase, String turno) {
        super(nome, cpf, telefone, email, matricula, salarioBase, turno);
        this.saldoCaixa = 1000.00; // saldo inicial
        this.transacoesRealizadas = 0;
    }
    
    public void registrarPagamento(double valor) {
        this.saldoCaixa += valor;
        this.transacoesRealizadas++;
        System.out.println("Caixa " + nome + " registrou pagamento de R$" + valor);
    }
    
    public void darTroco(double valor) {
        if (saldoCaixa >= valor) {
            saldoCaixa -= valor;
            System.out.println("Troco de R$" + valor + " entregue com sucesso");
        } else {
            System.out.println("Sem troco disponível no caixa!");
        }
    }
    
    public double getSaldoCaixa() { return saldoCaixa; }
    
    @Override
    public double calcularSalario() {
        return salarioBase + (transacoesRealizadas * 0.50); // bônus por transação
    }
    
    @Override
    public void trabalhar() {
        System.out.println(nome + " está processando pagamentos...");
    }

}
