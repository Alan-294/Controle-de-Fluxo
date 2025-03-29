import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Olá e bem vindo!");
        System.out.println("Insira um número: ");
        int numero1 = scan.nextInt();

        System.out.println("Agora insira um segundo número: ");
        int numero2 = scan.nextInt();

        try {
            contar(numero1, numero2);

        } catch (ParametrosInvalidosException exception) {
            System.out.println("Erro: " + exception.getMessage());
        }
    }


    static void contar(int numeroMenor, int numeroMaior) throws ParametrosInvalidosException {
        if (numeroMenor > numeroMaior) {
            throw new ParametrosInvalidosException();
        }
        int contagem = numeroMaior - numeroMenor;

        int numero = 1;
        while (numero <= contagem) {
            System.out.println("Imprimindo o número: " + numero);
            numero++;
        }
    }
}

    class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException() {
            super("O primeiro parâmetro deve ser menor que o segundo.");
        }
    }