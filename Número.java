import java.util.Scanner;

public class Número {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        System.out.println("Primeiro número: " + num1);
        System.out.println("Segundo número: " + num2);

        scanner.close();
    }
}