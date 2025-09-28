public class Departamento {
    private Funcionario[] funcionarios;
    private int capacidade;
    private int tamanho = 0;

    public Departamento(int capacidade) {
        this.capacidade = capacidade;
        this.funcionarios = new Funcionario[capacidade];
    }

    public boolean adicionarFuncionario(Funcionario f) {
        if (tamanho >= capacidade || f == null) return false;
        this.funcionarios[tamanho++] = f;
        return true;
    }

    public double calcularFolhaPagamento() {
        double total = 0.0;
        for (int i = 0; i < tamanho; i++) {
            total += funcionarios[i].getSalarioFinal();
        }
        return total;
    }

    public int getTamanho() {
        return tamanho;
    }
}
