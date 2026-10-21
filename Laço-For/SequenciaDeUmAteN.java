import java.util.Scanner;

public class SequenciaDeUmAteN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int limite = scanner.nextInt();

        System.out.print("Sequência: ");
        for (int i = 1; i <= limite; i++) {
            System.out.print(i + (i < limite ? " " : ".\n"));
        }

        scanner.close();
    }
}