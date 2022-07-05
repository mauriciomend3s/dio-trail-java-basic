import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner terminal = new Scanner(System.in);
        int parametroUm = 0;
        int parametroDois = 0;

        System.out.println("Digite o primeiro parâmetro.");
        parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro.");
        parametroDois = terminal.nextInt();

        terminal.close();

        try {

            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {

            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");

        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (i + 1) + ".");

        }
    }
}
