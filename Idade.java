import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduza o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Introduza o ano atual: ");
        int anoAtual = scanner.nextInt();

        int idadeAtual = anoAtual - anoNascimento;
        int idade2030 = 2030 - anoNascimento;

        System.out.println("Idade da pessoa: " + idadeAtual + " anos");
        System.out.println("Idade que terá em 2030: " + idade2030 + " anos");

        scanner.close();
    }
}