import java.util.Scanner;

public class Validação {
    public static void main (String [] Args){
        Scanner entrada = new Scanner (System.in);
    double nota;

    do {
        System.out.println( "=== Digite uma nota entre 0 e 10");
        nota = entrada.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota incorreta! O valor deve estar entre 0 e 10!");

        }
    } while (0 < nota || nota > 10);
    System.out.println ("\nNota válida registrada com sucesso: " + nota);
    entrada.close();
    }

}
