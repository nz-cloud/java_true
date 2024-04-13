public class Diretor extends Funcionario{
    
    public Diretor(String nome, double salario) {
        super(nome, salario);
    }
    double bonus() {
        return getSalario() * 0.15; 
    }
}
