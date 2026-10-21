package SwitchCase;
import java.util.Scanner;

public class SequenciaPotenciasDeDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int limite = scanner.nextInt();

        int valor = 1;
        System.out.print("Sequência: ");
        while (valor <= limite) {
            System.out.print(valor + " ");
            valor *= 2;
        }
        System.out.println();

        scanner.close();
    }
}