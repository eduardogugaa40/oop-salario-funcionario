public abstract class Funcionario {

    String nome;
    int salarioBase;

    Funcionario(int salarioBase){
        this.salarioBase = salarioBase;
    }



    abstract void calcularSalario();
}
