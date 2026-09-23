import java.util.Scanner;

public  class Dia {
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um número de 1 a 7: ");
        int dia = entrada.nextInt();

    switch (dia) {
    case 1:
        System.out.println("Domingo");
         break;

    case 2:
        System.out.println("Segunda");
         break;

    case 3:
        System.out.println("Terça");
         break;

    case 4:
        System.out.println("Quarta");
         break;

    case 5:
        System.out.println("Quinta");
         break;

     case 6:
        System.out.println("Sexta");
         break;
         
     case 7:
        System.out.println("Sabádo");
        break;

    default:
        System.out.println("Número inválido! Digite número entre 1 e 7");
        break;
}
        entrada.close();
}   
}
