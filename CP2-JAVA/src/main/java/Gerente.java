public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, String cpf, double salarioBase, double bonus) {
        super(nome, cpf, salarioBase);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        if (bonus >= 0) {
            this.bonus = bonus;
        } else {
            // manter o estado anterior e sinalizar erro
            System.err.println("Erro: O bônus não pode ser negativo.");
        }
    }

    @Override
    public double getSalarioFinal() {
        return super.getSalarioFinal() + this.bonus;
    }
}