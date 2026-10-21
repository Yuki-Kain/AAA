import java.util.Scanner;

public class CalculaPesoIdeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura (ex: 1,75): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o sexo (M para masculino / F para feminino): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        if (sexo == 'M') {
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("Peso ideal: %.2f kg\n", pesoIdeal);
        } else if (sexo == 'F') {
            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("Peso ideal: %.2f kg\n", pesoIdeal);
        } else {
            System.out.println("Sexo inválido! Digite M ou F.");
        }

        scanner.close();
    }
}