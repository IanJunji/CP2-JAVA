public class MainTest {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Ana", "111.111.111-11", 2000.0);
        Gerente g = new Gerente("Bruno", "222.222.222-22", 4000.0, 500.0);
        Diretor d = new Diretor("Carla", "333.333.333-33", 8000.0, 1000.0, 0.05);

        System.out.println("Funcionario salarioFinal: " + f.getSalarioFinal());
        System.out.println("Gerente salarioFinal: " + g.getSalarioFinal());
        System.out.println("Diretor salarioFinal: " + d.getSalarioFinal());

        f.aumentarSalario(); // +10%
        g.aumentarSalario(5.0); // +5%
        d.aumentarSalario(3.0, 200.0); // +3% + 200

        System.out.println("Funcionario salarioFinal apos aumento: " + f.getSalarioFinal());
        System.out.println("Gerente salarioFinal apos aumento: " + g.getSalarioFinal());
        System.out.println("Diretor salarioFinal apos aumento: " + d.getSalarioFinal());

        Departamento dept = new Departamento(5);
        dept.adicionarFuncionario(f);
        dept.adicionarFuncionario(g);
        dept.adicionarFuncionario(d);

        System.out.println("Folha total: " + dept.calcularFolhaPagamento());
    }
}
