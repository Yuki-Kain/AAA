import java.util.Scanner;

public class CalculaBonusSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o tempo de trabalho (em anos): ");
        int anos = scanner.nextInt();

        double bonus;
        if (anos >= 5) {
            bonus = salario * 0.20; // 20%
        } else {
            bonus = salario * 0.10; // 10%
        }

        System.out.printf("O valor do bônus é: R$ %.2f\n", bonus);

        scanner.close();
    }
}