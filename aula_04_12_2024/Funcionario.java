import java.util.Scanner;

public class Funcionario {
    
    //escxreva uma classe funcioanrio que tenha 2 atributos:
    //nome e salário 
    //leia e crie 5 funcionarios a partir do teclçado e informe o nome de quem ganha mais e quem ganha menos
    //guarde os funcionarios em um vetor (array)

        private String nome;
        private double salario;

        public Funcionario(String nome, double salario) {
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