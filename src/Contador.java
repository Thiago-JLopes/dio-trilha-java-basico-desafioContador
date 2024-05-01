import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        int parametroUm = 0, parametroDois = 0;

        try {
            System.out.print("Digite o primeiro parâmetro: ");
            parametroUm = terminal.nextInt();

            System.out.print("Digite o segundo parâmetro: ");
            parametroDois = terminal.nextInt();

            terminal.close();

        } catch (InputMismatchException e) {
           System.out.println("ERRO! Digite apenas numeros inteiros");
        }

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for(int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (i+1));
        }
    }
}
