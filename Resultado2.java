public class Resultado2 {
    public static void main(String[] args) {
        boolean exp1 = ((120 - 30) == Math.pow(3, 30));
        boolean exp2 = !((20 % 4 == 1) || (9 != 9));
        boolean exp3 = ((5 % 2) > 3);
        boolean exp4 = ('a' == 'A');

        System.out.println("Resultado 1: " + exp1);
        System.out.println("Resultado 2: " + exp2);
        System.out.println("Resultado 3: " + exp3);
        System.out.println("Resultado 4: " + exp4);
    }
}