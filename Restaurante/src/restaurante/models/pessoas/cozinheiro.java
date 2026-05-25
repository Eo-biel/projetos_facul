package restaurante.models.pessoas;

public class cozinheiro extends funcionario {
    private String especialidade;
    private int pratosPreparados;
    
    public void Cozinheiro(String nome, String cpf, String telefone, String email,
                     String matricula, double salarioBase, String turno, String especialidade) {
        super(nome, cpf, telefone, email, matricula, salarioBase, turno);
        this.especialidade = especialidade;
        this.pratosPreparados = 0;
    }
    
    public void prepararPrato(String prato) {
        pratosPreparados++;
        System.out.println("Cozinheiro " + nome + " preparou: " + prato);
    }
    
    public String getEspecialidade() { return especialidade; }
    
    @Override
    public double calcularSalario() {
        return salarioBase + (pratosPreparados * 2.0);
    }
    
    @Override
    public void trabalhar() {
        System.out.println(nome + " está preparando pratos deliciosos na cozinha...");
    }

}
