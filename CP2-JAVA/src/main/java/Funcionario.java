public class Funcionario {
    public static void main(String[] args) {
    return;
    }   
    
    private String nome;
    private String cpf;
    private float salarioBase;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, float salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public float getSalarioFinal(){
        return this.salarioBase;
    }
}
