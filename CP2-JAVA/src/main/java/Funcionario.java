public class Funcionario {

    String name;
    String cpf;
    float salarioBase;

    public static  main(String name, String cpf, float salarioBase) {
        this.name = name;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }


    public float getSalarioFinal(this.salarioBase){
        return salarioBase;
    }
}
