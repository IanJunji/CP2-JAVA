public class Diretor extends Gerente {  
    private double porcentagemParticipacaoLucros;

    public Diretor(String nome, String cpf, double salarioBase, double bonus, double porcentagemParticipacaoLucros) {
        super(nome, cpf, salarioBase, bonus);
        this.porcentagemParticipacaoLucros = porcentagemParticipacaoLucros;
    }

    @Override
    public double getSalarioFinal() {
        double base = super.getSalarioBase();
        double participacao = base * this.porcentagemParticipacaoLucros;
        return base + super.getBonus() + participacao;
    }

    public double getPorcentagemParticipacaoLucros() {
        return porcentagemParticipacaoLucros;
    }

    public void setPorcentagemParticipacaoLucros(double porcentagemParticipacaoLucros) {
        this.porcentagemParticipacaoLucros = porcentagemParticipacaoLucros;
    }
}