import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1º número inteiro: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o 2º número inteiro: ");
        int n2 = scanner.nextInt();

        System.out.print("Digite o 3º número inteiro: ");
        int n3 = scanner.nextInt();

        System.out.print("Digite o 4º número inteiro: ");
        int n4 = scanner.nextInt();

        int soma = n1 + n2 + n3 + n4;

        System.out.println("A soma dos quatro números é: " + soma);

        scanner.close();
    }
}