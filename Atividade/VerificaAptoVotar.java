import java.util.Scanner;

public class VerificaAptoVotar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("Não eleitor (não está apto a votar).");
        } else if ((idade >= 16 && idade < 18) || idade > 70) {
            System.out.println("Apto a votar (Voto Facultativo).");
        } else {
            System.out.println("Apto a votar (Voto Obrigatório).");
        }

        scanner.close();
    }
}