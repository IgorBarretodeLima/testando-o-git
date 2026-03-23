import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao{
    public static void main(String[] args) {
        // Ferramentas que vamos usar
        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();

        // Atributos do jogo
        int numeroSecreto = gerador.nextInt(100) + 1; // Gera de 0-9, somamos 1 para ser 1-10
        int palpite = 0;
        int tentativas = 0;

        System.out.println("--- BEM-VINDO AO JOGO DE ADIVINHAÇÃO ---");
        System.out.println("Tente adivinhar o número entre 1 e 100!");

        // Loop que continua enquanto o jogador não acerta
        while (palpite != numeroSecreto) {
            System.out.print("Digite seu palpite: ");
            palpite = leitor.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("Muito baixo! Tente um número maior.");
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto! Tente um número menor.");
            } else {
                System.out.println("PARABÉNS! Você acertou em " + tentativas + " tentativas.");
            }
        }

        leitor.close();
    }
}