import java.util.Scanner;

public class adivinha {

    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.println( "digite o seu palpite.");
        int palpite = entrada.nextInt();

        if (palpite == 15){
            System.out.println( "Parabéns, você acertou. O Número secreto é 15.");
        }else if (palpite < 15){
            System.out.println( "Seu palpite está baixo.");
       }else if (palpite > 15){
            System.out.println("Seu palpite está acima.");
       }
       entrada.close();
    }
}