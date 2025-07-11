import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int tentativa = 0;
        int palpite = 0;

        System.out.println("Bem-vindo(a) ao jogo da adivinhação!");
        System.out.println("Tente adivinhar um número de 1 a 100.");

        while (palpite != numeroSecreto) {
            System.out.print("Digite o seu número: ");
            palpite = scanner.nextInt();
            tentativa++;

            if (palpite < numeroSecreto) {
                System.out.println("O número secreto é MAIOR!");
            } else if (palpite > numeroSecreto) {
                System.out.println("O número secreto é MENOR!");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativa + " tentativa(s).");
            }
        }

        scanner.close();
    }
}