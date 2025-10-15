package application;

import java.util.ArrayList;
import java.util.Scanner;
import entities.Funcionario;
import entities.Terceirizado;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList();

        System.out.println("Digite o numero de funcionarios");
        int n = teclado.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Terceirizado? (s/n) ");
            teclado.nextLine();
            String fun = teclado.nextLine();
            System.out.println("Digite o nome ");
            String nome = teclado.nextLine();
            System.out.println("Digite as horas ");
            int horas = teclado.nextInt();
            System.out.println("Digite o valor por hora ");
            Double valor = teclado.nextDouble();
            if (fun.equalsIgnoreCase("s")) {
                System.out.println("Digite o valor do adicional");
                Double adicional = teclado.nextDouble();
                Terceirizado terc = new Terceirizado(nome, horas, valor, adicional);
                funcionarios.add(terc);
            } else {
                Funcionario func = new Funcionario(nome, horas, valor);
                funcionarios.add(func);
            }
        }
        for (Funcionario funcionario : funcionarios) {

            Double pag = funcionario.pagamento();
            System.out.println("Funcionário: " + funcionario.getNome() + " Total: " + pag);
        }

        System.out.println("ultimo teste");
    }
}
