import java.util.Scanner;

public class PedidoLanchonete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do produto (100 a 105): ");
        int codigo = scanner.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        String produto = "";
        double precoUnitario = 0.0;
        boolean codigoValido = true;

        switch (codigo) {
            case 100:
                produto = "Cachorro Quente";
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
                System.out.println("Código de produto inválido!");
                codigoValido = false;
                break;
        }

        if (codigoValido) {
            double valorTotal = precoUnitario * quantidade;
            System.out.println("Produto: " + produto);
            System.out.printf("Valor a ser pago: R$ %.2f\n", valorTotal);
        }

        scanner.close();
    }
}