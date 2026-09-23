import java.util.Scanner;

public class Período {

    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um horário entre de 7 a 23 horas: ");
        int horário = entrada.nextInt();

         switch (horário) {
    case 7:
        System.out.println("Matutino. Bom dia!");
         break;

    case 8:
        System.out.println("Matutino. Bom dia!");
         break;

    case 9:
        System.out.println("Matutino. Bom dia!");
         break;

    case 10:
        System.out.println("Matutino. Bom dia!");
         break;

    case 11:
        System.out.println("Matutino. Bom dia!");
         break;

     case 12:
        System.out.println("Matutino. Bom dia!");
         break;
         
     case 13:
        System.out.println("Verpertino. Boa tarde!");
        break;

     case 14:
        System.out.println("Verpertino. Boa tarde!");
        break;

    case 15:
        System.out.println("Verpertino. Boa tarde!");
        break;

    case 16:
        System.out.println("Verpertino. Boa tarde!");
        break;

    case 17:
        System.out.println("Verpertino. Boa tarde!");
         break;

    case 18:
        System.out.println("Verpertino. Boa tarde!");
         break;

    case 19:
        System.out.println("Noturno. Boa noite!");
         break;

    case 20:
        System.out.println("Noturno. Boa noite!");
         break;

    case 21:
        System.out.println("Noturno. Boa noite!");
         break;

     case 22:
        System.out.println("Noturno. Boa noite!");
         break;

        case 23:
        System.out.println("Noturno. Boa noite!");
        break;
    default:
        System.out.println("Horário inválido! Digite um horário entre 7 horas e 23 horas");
        break;
}
  entrada.close();
}
}
