package TiposdeDados;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a 1ª nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a 2ª nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a 3ª nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3.0;

        System.out.printf("A média aritmética do aluno é: %.2f\n", media);

        scanner.close();
    }
}