package SwitchCase;
import java.util.Scanner;

public class OperacoesOpcoesMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Escolha a opção (M - Média, S - Diferença, P - Produto, D - Divisão): ");
        char opcao = scanner.next().toUpperCase().charAt(0);

        switch (opcao) {
            case 'M':
                double media = (num1 + num2) / 2.0;
                System.out.println("Média entre os números: " + media);
                break;
            case 'S':
                double diferenca = (num1 >= num2) ? (num1 - num2) : (num2 - num1);
                System.out.println("Diferença do maior pelo menor: " + diferenca);
                break;
            case 'P':
                double produto = num1 * num2;
                System.out.println("Produto entre os números: " + produto);
                break;
            case 'D':
                if (num2 == 0) {
                    System.out.println("Impossível dividir por zero!");
                } else {
                    double divisao = num1 / num2;
                    System.out.println("Divisão do primeiro pelo segundo: " + divisao);
                }
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        scanner.close();
    }
}