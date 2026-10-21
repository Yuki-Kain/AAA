import java.util.Scanner;

public class CalculaIMCDezPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorSemObesidade = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("\n--- Pessoa " + i + " ---");
            System.out.print("Digite o peso (kg): ");
            double peso = scanner.nextDouble();

            System.out.print("Digite a altura (m): ");
            double altura = scanner.nextDouble();

            double imc = peso / (altura * altura);
            System.out.printf("IMC: %.2f\n", imc);

            if (imc >= 18.5 && imc <= 24.9) {
                contadorSemObesidade++;
            }
        }

        System.out.println("\nTotal de pessoas com IMC considerado sem obesidade (18,5 a 24,9): " + contadorSemObesidade);

        scanner.close();
    }
}