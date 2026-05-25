package restaurante.models.pessoas;

public class cliente extends pessoas {

    private String codigoFidelidade;
    private int pontosFidelidade;
    private int pedidosRealizados;

    public void Cliente(String nome, String cpf, String telefone, String email) {
        super(nome, cpf, telefone, email);
        this.codigoFidelidade = "CLI" + System.currentTimeMillis();
        this.pontosFidelidade = 0;
        this.pedidosRealizados = 0;
    }

    public String getCodigoFidelidade() {
        return codigoFidelidade;
    }

    public int getPontosFidelidade() {
        return pontosFidelidade;
    }

    public void adicionarPontos(int pontos) {
        this.pontosFidelidade += pontos;
        System.out.println(nome + " ganhou " + pontos + " pontos! Total: " + pontosFidelidade);
    }

    public void adicionarPedido() {
        this.pedidosRealizados++;
    }

    public int getPedidosRealizados() {
        return pedidosRealizados;
    }

    @Override
    public void apresentar() {
        System.out.printf("Cliente: %s | Fidelidade: %s | Pontos: %d\n",
                nome, codigoFidelidade, pontosFidelidade);
    }

}
