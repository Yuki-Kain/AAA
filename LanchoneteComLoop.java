import java.util.Scanner;

public class LanchoneteComLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalGeral = 0.0;
        char continuar;

        do {
            System.out.print("\nDigite o código do produto (100 a 105): ");
            int codigo = scanner.nextInt();

            System.out.print("Digite a quantidade: ");
            int quantidade = scanner.nextInt();

            String produto = "";
            double precoUnitario = 0.0;
            boolean codigoValido = true;

            switch (codigo) {
                case 100:
                    produto = "Cachorro quente";
                    precoUnitario = 1.20;
                    break;
                case 101:
                    produto = "Bauru Simples";
                    precoUnitario = 1.30;
                    break;
                case 102:
                    produto = "Bauru com ovo";
                    precoUnitario = 1.50;
                    break;
                case 103:
                    produto = "Hambúrguer";
                    precoUnitario = 1.20;
                    break;
                case 104:
                    produto = "Cheeseburguer";
                    precoUnitario = 1.30;
                    break;
                case 105:
                    produto = "Refrigerante";
                    precoUnitario = 1.00;
                    break;
                default:
                    System.out.println("Código inválido!");
                    codigoValido = false;
                    break;
            }

            if (codigoValido) {
                double subtotal = precoUnitario * quantidade;
                totalGeral += subtotal;
                System.out.printf("Item: %s | Quantidade: %d | Subtotal: R$ %.2f\n", produto, quantidade, subtotal);
            }

            System.out.print("Deseja continuar comprando? (S/N): ");
            continuar = scanner.next().toUpperCase().charAt(0);

        } while (continuar == 'S');

        System.out.printf("\nValor total da compra: R$ %.2f\n", totalGeral);

        scanner.close();
    }
}