import java.util.Scanner;

public class VerificaMetadeMaiorQue20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero > 20) {
            double metade = numero / 2.0;
            System.out.println("A metade do número é: " + metade);
        }

        scanner.close();
    }
}