public class CLT extends Funcionario{

    CLT(int salarioBase) {
        super(salarioBase);
    }

    @Override
    void calcularSalario() {
        int salarioFinal = salarioBase += 1000;
        System.out.println("O Salario é igual: " + salarioFinal);
    }
}
