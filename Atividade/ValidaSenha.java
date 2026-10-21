import java.util.Scanner;

public class ValidaSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String senha = scanner.next();

        if (senha.equals("25112511")) {
            System.out.println("acesso concedido");
        } else {
            System.out.println("acesso negado");
        }

        scanner.close();
    }
}