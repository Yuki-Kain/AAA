import java.util.Scanner;

public class CalculaAumentoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o plano de trabalho (A, B ou C): ");
        char plano = scanner.next().toUpperCase().charAt(0);

        System.out.print("Digite o salário atual: R$ ");
        double salarioAtual = scanner.nextDouble();

        double novoSalario = 0.0;
        boolean planoValido = true;

        switch (plano) {
            case 'A':
                novoSalario = salarioAtual * 1.10;
                break;
            case 'B':
                novoSalario = salarioAtual * 1.15;
                break;
            case 'C':
                novoSalario = salarioAtual * 1.20;
                break;
            default:
                System.out.println("Plano de trabalho inválido!");
                planoValido = false;
                break;
        }

        if (planoValido) {
            System.out.printf("O novo salário é: R$ %.2f\n", novoSalario);
        }

        scanner.close();
    }
}