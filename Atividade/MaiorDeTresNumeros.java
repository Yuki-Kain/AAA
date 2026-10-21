import java.util.Scanner;

public class MaiorDeTresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o 2º número: ");
        int n2 = scanner.nextInt();

        System.out.print("Digite o 3º número: ");
        int n3 = scanner.nextInt();

        if (n1 == n2 && n2 == n3) {
            System.out.println("os números são iguais");
        } else {
            int maior = n1;
            if (n2 > maior) {
                maior = n2;
            }
            if (n3 > maior) {
                maior = n3;
            }
            System.out.println("O maior número é: " + maior);
        }

        scanner.close();
    }
}