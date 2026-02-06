public class PJ extends Funcionario{

    PJ(int salarioBase){
        super(salarioBase);
    }

    @Override
    void calcularSalario() {
        double salarioFinal = salarioBase *= 1.2;
        System.out.println("O Salario é igual: " + salarioFinal);
    }
}
