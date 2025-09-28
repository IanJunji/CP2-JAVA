public class Funcionario {
    private String nome;
    private String cpf;
    private double salarioBase;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    // Getters / Setters (encapsulamento)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase >= 0) {
            this.salarioBase = salarioBase;
        } else {
            System.out.println("Erro: Salário base não pode ser negativo.");
        }
    }

    /**
     * Retorna o salário final do funcionário (por padrão, o salário base).
     */
    public double getSalarioFinal(){
        return this.salarioBase;
    }

    // Sobrecarga de métodos para aumento de salário
    // 1) Sem parâmetros: aumenta 10%
    public void aumentarSalario(){
        aumentarSalario(10.0);
    }

    // 2) Com porcentagem (ex.: 10.0 significa 10%)
    public void aumentarSalario(double porcentagem){
        if (porcentagem < 0) {
            System.out.println("Erro: porcentagem de aumento não pode ser negativa.");
            return;
        }
        this.salarioBase += this.salarioBase * (porcentagem / 100.0);
    }

    // 3) Com porcentagem e um valor extra (bonusExtra em unidades monetárias)
    public void aumentarSalario(double porcentagem, double bonusExtra){
        if (porcentagem < 0) {
            System.out.println("Erro: porcentagem de aumento não pode ser negativa.");
            return;
        }
        this.salarioBase += this.salarioBase * (porcentagem / 100.0) + bonusExtra;
    }
}
