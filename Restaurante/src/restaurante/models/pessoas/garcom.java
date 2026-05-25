package restaurante.models.pessoas;

public class garcom extends funcionario {
    private int mesasAtendidas;
    private double gorjetas;
    
    public void Garcom(String nome, String cpf, String telefone, String email, 
                 String matricula, double salarioBase, String turno) {
        super(nome, cpf, telefone, email, matricula, salarioBase, turno);
        this.mesasAtendidas = 0;
        this.gorjetas = 0;
    }
    
    public void atenderMesa(int numeroMesa) {
        mesasAtendidas++;
        System.out.println("Garçom " + nome + " atendeu a mesa " + numeroMesa);
    }
    
    public void adicionarGorjeta(double valor) {
        this.gorjetas += valor;
    }
    
    @Override
    public double calcularSalario() {
        return salarioBase + gorjetas;
    }
    
    @Override
    public void trabalhar() {
        System.out.println(nome + " está atendendo mesas e anotando pedidos...");
    }

}
