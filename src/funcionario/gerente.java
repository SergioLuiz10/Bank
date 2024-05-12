package funcionario;

public class gerente extends Funcionario {

    public gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        salario+=salario*0.1;
    }
}
