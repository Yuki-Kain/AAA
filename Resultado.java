public class Resultado {
    public static void main(String[] args) {
        double exp1 = (20.0 - 15.0) / 2.0;
        double exp2 = Math.pow(2, 5.0 / 20.0) + 30.0 / Math.pow(15, 2);
        double exp3 = 35.0 / (6 + 2);
        int exp4 = 23 % 4;

        System.out.println("Resultado 1: " + exp1);
        System.out.println("Resultado 2: " + exp2);
        System.out.println("Resultado 3: " + exp3);
        System.out.println("Resultado 4 (resto): " + exp4);
    }
}