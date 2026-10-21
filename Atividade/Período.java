import java.util.Scanner;

public class Período {

    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite M, V ou N para descobrir o seu período: ");
        String período = entrada.nextLine();

        String M ();
        String N ();
        String = V();

         switch (período) {
    case M:
        System.out.println("Matutino. Bom dia!");
         break;

    case V:
        System.out.println("Verpertino. Boa tarde!");
         break;

    case N:
        System.out.println("Noturno. Bom dia!");
         break;

    default:
        System.out.println("Horário inválido! Digite a letra referente ao seu peíodo");
        break;
}
  entrada.close();
}
}
