import java.util.Scanner;

public class Pagamento{
    public static void main(String[] args) {
        
        Funcionario[] funcionarios = new Funcionario[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("Nome: ");
            String nome = sc.next();

            System.out.println("Salário: ");
            double salario = sc.nextDouble();

            funcionarios[i] = new Funcionario(nome, salario);

        }
        double maior_salario = 0;
        for (int i = 0; i < funcionarios.length; i++) {
            double salario = funcionarios[i].getSalario();
            if (salario > maior_salario) {
                maior_salario = salario;
            }

        }
        System.out.println("O maior é salário é: " + maior_salario);
        sc.close();
    }
}