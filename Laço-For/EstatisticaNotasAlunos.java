import java.util.Scanner;

public class EstatisticaNotasAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aprovados = 0;
        int exame = 0;
        int reprovados = 0;
        double somaMediasClasse = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("--- Aluno " + i + " ---");
            System.out.print("Digite a 1ª nota: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Digite a 2ª nota: ");
            double nota2 = scanner.nextDouble();

            double media = (nota1 + nota2) / 2.0;
            somaMediasClasse += media;

            System.out.printf("Média do aluno %d: %.2f - ", i, media);

            if (media <= 3.0) {
                System.out.println("REPROVADO");
                reprovados++;
            } else if (media < 7.0) {
                System.out.println("EXAME");
                exame++;
            } else {
                System.out.println("APROVADO");
                aprovados++;
            }
        }

        double mediaClasse = somaMediasClasse / 6.0;

        System.out.println("\n=== RESUMO DA CLASSE ===");
        System.out.println("Total de alunos aprovados: " + aprovados);
        System.out.println("Total de alunos de exame: " + exame);
        System.out.println("Total de alunos reprovados: " + reprovados);
        System.out.printf("Média da classe: %.2f\n", mediaClasse);

        scanner.close();
    }
}