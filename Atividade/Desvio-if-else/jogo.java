import java.util.Scanner;

public class jogo {
    public static void main (String [] args) {
    Scanner entrada = new Scanner (System.in);
    System.out.println("digite o número de pontos do Jogador 1 na fase 1.");
    Double pontos = entrada.nextDouble();


    if (pontos >= 1000){
        System.out.println("Parabéns, você passou para a segunda fase.");
    }else{
        System.out.println("Você não atingiu a pontuação necessária, tente novamente.");
    }

    System.out.println("Siga para a próxima etapa.");
    entrada.close();
    }
    }