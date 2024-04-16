package aula_04_15_2024;

public class Aviao {
    private String nome_empresa_aviacao;
    private int qnt_horas_aviao;
    //private boolean tem_gasolina;

    public Aviao (String nome_empresa_aviacao) {
        this.nome_empresa_aviacao = nome_empresa_aviacao;
        qnt_horas_aviao = 0;
       //tem_gasolina = false;
    }

    //public void abastece() {
    //    tem_gasolina = true;
    //}

    public void faz_voo(int qnt_de_horas, Piloto p) {
        qnt_horas_aviao = qnt_horas_aviao + qnt_de_horas;
        p.faz_voo(qnt_de_horas);
    }
    public void imprime() {
        System.out.println("Avião empresa: " + nome_empresa_aviacao + "qntd de horas vôo");
    }
    
}
