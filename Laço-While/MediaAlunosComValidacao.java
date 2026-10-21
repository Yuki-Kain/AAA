package SwitchCase;
import java.util.Scanner;

public class MediaAlunosComValidacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("\n--- Aluno " + i + " ---");

            double nota1;
            do {
                System.out.print("Digite a 1ª nota (0 a 10): ");
                nota1 = scanner.nextDouble();
                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("Nota inválida! Tente novamente.");
                }
            } while (nota1 < 0 || nota1 > 10);

            double nota2;
            do {
                System.out.print("Digite a 2ª nota (0 a 10): ");
                nota2 = scanner.nextDouble();
                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("Nota inválida! Tente novamente.");
                }
            } while (nota2 < 0 || nota2 > 10);

            double media = (nota1 + nota2) / 2.0;
            System.out.printf("Média do Aluno %d: %.2f\n", i, media);
        }

        scanner.close();
    }
}