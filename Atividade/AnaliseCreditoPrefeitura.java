import java.util.Scanner;

public class AnaliseCreditoPrefeitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário bruto: ");
        double salarioBruto = scanner.nextDouble();

        System.out.print("Digite o valor da prestação: ");
        double prestacao = scanner.nextDouble();

        double limitePrestacao = salarioBruto * 0.30;

        if (prestacao <= limitePrestacao) {
            System.out.println("Empréstimo pode ser concedido!");
        } else {
            System.out.println("Empréstimo não pode ser concedido!");
        }

        scanner.close();
    }
}