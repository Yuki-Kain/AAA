package TiposdeDados;
public class Raio {
    public static void main(String[] args) {
        double pi = 3.14159;
        double raio = 5.0;
        
        // Cálculo da área: π * r²
        double area = pi * Math.pow(raio, 2);

        System.out.println("A área do círculo com raio de " + raio + " cm é: " + area + " cm²");
    }
}