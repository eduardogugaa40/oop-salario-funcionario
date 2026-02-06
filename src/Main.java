public class Main {
    public static void main(String[] args) {
        int salarioBase = 1518;

        Funcionario funcionario1 = new CLT(salarioBase);
        Funcionario funcionario2 = new PJ(salarioBase);

        Funcionario[] funcionarios = {funcionario1, funcionario2};

        for (Funcionario funcionario : funcionarios) {
            funcionario.calcularSalario();
        }

    }
}