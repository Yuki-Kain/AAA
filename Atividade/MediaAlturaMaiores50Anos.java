import java.util.Scanner;

public class MediaAlturaMaiores50Anos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaAlturas = 0;
        int contadorMaiores50 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("--- Pessoa " + i + " ---");
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite a altura (m): ");
            double altura = scanner.nextDouble();

            if (idade > 50) {
                somaAlturas += altura;
                contadorMaiores50++;
            }
        }

        if (contadorMaiores50 > 0) {
            double media = somaAlturas / contadorMaiores50;
            System.out.printf("Média das alturas das pessoas com mais de 50 anos: %.2f m\n", media);
        } else {
            System.out.println("Nenhuma pessoa com mais de 50 anos foi registada.");
        }

        scanner.close();
    }
}