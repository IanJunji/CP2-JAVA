public class Diretor extends Gerente {  
    private double porcentagemParticipacaoLucros;

    public Diretor(String nome, String cpf, double salarioBase, double bonus, double porcentagemParticipacaoLucros) {
        super(nome, cpf, salarioBase, bonus);
        this.porcentagemParticipacaoLucros = porcentagemParticipacaoLucros;


    }
    public double getSalarioFinal() {
        double participacao = super.getSalarioBase() * this.porcentagemParticipacaoLucros;
        return super.getSalarioBase() + super.getBonus() + participacao;
        
    }
    public double getPorcentagemParticipacaoLucros() {
        return porcentagemParticipacaoLucros;
    }

    public void setPorcentagemParticipacaoLucros(double porcentagemParticipacaoLucros) {
        this.porcentagemParticipacaoLucros = porcentagemParticipacaoLucros;
    }
}