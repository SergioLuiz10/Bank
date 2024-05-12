package itaú;

import funcionario.gerente;
import funcionario.junior;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class itaú {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o numero de gerentes:");
        int n = ler.nextInt();
        ler.nextLine(); 

        List<gerente> lista = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Digite seu nome:");
            String nome = ler.nextLine();
            System.out.println("Digite seu salario:");
            double salario = ler.nextDouble();

            gerente grana = new gerente(nome, salario);
            grana.calculaBonus();
            lista.add(grana);
            System.out.println(grana.getNome() + "," + grana.getSalario());
        }

        System.out.println("Digite o numero de Developers juniors:");
        int m = ler.nextInt();
        ler.nextLine();

        List<junior> lista2 = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            System.out.println("Digite seu nome:");
            String nome = ler.nextLine();
            System.out.println("Digite seu salario:");
            double salario = ler.nextDouble();

            junior minimo = new junior(nome, salario);
            minimo.calculaBonus();
            lista2.add(minimo);
            System.out.println(minimo.getNome() + "," + minimo.getSalario());
        }
    }
}
