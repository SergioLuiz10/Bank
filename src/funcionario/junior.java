package funcionario;

public class junior extends Funcionario {
    public junior(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        salario+=salario*0.05;
    }
}
