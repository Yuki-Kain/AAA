import java.util.Scanner;

public class Números {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        double quadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);
        double raizQuadrada = Math.sqrt(numero);
        double potencia10 = Math.pow(numero, 10);

        System.out.println("Número ao quadrado: " + quadrado);
        System.out.println("Número ao cubo: " + cubo);
        System.out.println("Raiz quadrada do número: " + raizQuadrada);
        System.out.println("Número elevado à potência 10: " + potencia10);

        scanner.close();
    }
}