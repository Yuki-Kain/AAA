import java.util.Scanner;

public class ApuracaoEleicaoPresidencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int c1 = 0, c2 = 0, c3 = 0, c4 = 0;
        int nulos = 0;
        int brancos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Eleitor " + i + " - Digite o seu voto (1 a 4 para candidatos, 5 para nulo, 6 para branco): ");
            int voto = scanner.nextInt();

            switch (voto) {
                case 1: c1++; break;
                case 2: c2++; break;
                case 3: c3++; break;
                case 4: c4++; break;
                case 5: nulos++; break;
                case 6: brancos++; break;
                default:
                    System.out.println("Voto inválido! Considerado como nulo.");
                    nulos++;
                    break;
            }
        }

        double percentualBrancosNulos = ((brancos + nulos) / 10.0) * 100.0;

        System.out.println("\n=== RESULTADO DA ELEIÇÃO ===");
        System.out.println("Total de votos do Candidato 1: " + c1);
        System.out.println("Total de votos do Candidato 2: " + c2);
        System.out.println("Total de votos do Candidato 3: " + c3);
        System.out.println("Total de votos do Candidato 4: " + c4);
        System.out.println("Total de votos nulos: " + nulos);
        System.out.println("Total de votos em branco: " + brancos);
        System.out.printf("Percentual de votos brancos e nulos: %.2f%%\n", percentualBrancosNulos);

        scanner.close();
    }
}