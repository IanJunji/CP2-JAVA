public class Funcionario {

    String name;
    int cpf;
    int salarioBase;

    public static  main(String name, int cpf, int salarioBase) {
        this.name = name;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }


    public int getSalarioFinal(this.salarioBase){
        return salarioBase;
    }
}
