import java.util.Scanner;

public class MenorDeDezNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menor = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número inteiro e positivo: ");
            int numero = scanner.nextInt();

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("O menor número digitado foi: " + menor);

        scanner.close();
    }
}