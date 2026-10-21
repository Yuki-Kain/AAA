import java.util.Scanner;

public class EstatisticaIdadeAlturaPeso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maiores50 = 0;
        double somaAlturas10a20 = 0;
        int contador10a20 = 0;
        int pesoMenor40 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("--- Pessoa " + i + " ---");
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite a altura (m): ");
            double altura = scanner.nextDouble();

            System.out.print("Digite o peso (kg): ");
            double peso = scanner.nextDouble();

            if (idade > 50) {
                maiores50++;
            }

            if (idade >= 10 && idade <= 20) {
                somaAlturas10a20 += altura;
                contador10a20++;
            }

            if (peso < 40.0) {
                pesoMenor40++;
            }
        }

        double porcentagemPesoMenor40 = (pesoMenor40 / 10.0) * 100.0;

        System.out.println("\n=== RESULTADOS ===");
        System.out.println("a) Quantidade de pessoas maiores de 50 anos: " + maiores50);

        if (contador10a20 > 0) {
            double mediaAltura = somaAlturas10a20 / contador10a20;
            System.out.printf("b) Média das alturas das pessoas entre 10 e 20 anos: %.2f m\n", mediaAltura);
        } else {
            System.out.println("b) Nenhuma pessoa com idade entre 10 e 20 anos foi registada.");
        }

        System.out.printf("c) Porcentagem de pessoas com peso inferior a 40 kg: %.2f%%\n", porcentagemPesoMenor40);

        scanner.close();
    }
}