import java.util.Scanner;

public class CalculaDescontoINSS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário: R$ ");
        double salario = scanner.nextDouble();

        double desconto = 0.0;

        if (salario <= 600.00) {
            System.out.println("Isento de desconto do INSS.");
        } else if (salario <= 1200.00) {
            desconto = salario * 0.20; // 20%
        } else if (salario <= 2000.00) {
            desconto = salario * 0.25; // 25%
        } else {
            desconto = salario * 0.30; // 30%
        }

        if (salario > 600.00) {
            System.out.printf("Valor do desconto do INSS: R$ %.2f\n", desconto);
            System.out.printf("Salário com desconto: R$ %.2f\n", (salario - desconto));
        }

        scanner.close();
    }
}