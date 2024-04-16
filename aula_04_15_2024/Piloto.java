package aula_04_15_2024;

public class Piloto {
    private String nome;
    private int qnt_horas_voo;
    private int idade;

    public Piloto (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        qnt_horas_voo = 0;
    }

   //public int idade() {
   //    return idade;
   //}

    public String getNome() {
        return nome;
    }
    
    public int getQnt_horas_voo() {
        return qnt_horas_voo;
    }

    public void faz_voo (int qnt_horas) {
        qnt_horas_voo = qnt_horas_voo + qnt_horas;
    }

    public void imprime() {
        System.out.println("Piloto: " + nome + " / Horas de vôo: " + qnt_horas_voo + " / Idade: " + idade);
    }
}
