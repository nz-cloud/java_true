import java.util.Scanner;

public class Funcionario {
    
    //escxreva uma classe funcioanrio que tenha 2 atributos:
    //nome e salário 
    //leia e crie 5 funcionarios a partir do teclçado e informe o nome de quem ganha mais e quem ganha menos
    //guarde os funcionarios em um vetor (array)
   
//    String [] nomes = new String[6];
//    Scanner sc = new Scanner(System.in);
//    for (int i = 0; i < nomes.length; i++) {
//        System.out.println("Digite o nome do primeiro funcionario: ");
//        int nome = sc.next();
//
//    }
//
//    }
//}
        String nome;
        double salario;

        Funcionario(String nome, double salario) {
            this.nome = nome;
            this.salario = salario;
        }

        public String getNome() {
            return nome;
        }

        public double getSalario() {
            return salario;
        }

    
}