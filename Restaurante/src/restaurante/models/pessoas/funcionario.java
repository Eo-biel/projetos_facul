package restaurante.models.pessoas;

public abstract class funcionario extends pessoas {
    protected String matricula;
    protected double salarioBase;
    protected String turno;
    protected funcionario supervisor;
    
    public void Funcionario(String nome, String cpf, String telefone, 
                      String email, String matricula, double salarioBase, String turno) {
        super(nome, cpf, telefone, email);
        this.matricula = matricula;
        this.salarioBase = salarioBase;
        this.turno = turno;
    }
    
    // Getters e Setters
    public String getMatricula() { return matricula; }
    public double getSalarioBase() { return salarioBase; }
    public void setSalarioBase(double salarioBase) { this.salarioBase = salarioBase; }
    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }
    
    public funcionario getSupervisor() { return supervisor; }
    public void setSupervisor(funcionario supervisor) { 
        this.supervisor = supervisor;
        System.out.println(supervisor.getNome() + " é agora supervisor de " + this.nome);
    }
    
    // Método abstrato
    public abstract double calcularSalario();
    
    public abstract void trabalhar();
    
    @Override
    public void apresentar() {
        System.out.printf("Funcionário: %s | Matrícula: %s | Turno: %s\n", 
            nome, matricula, turno);
    }

}
