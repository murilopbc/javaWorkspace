import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner leia = new Scanner(System.in);

        int palpite;

        int num_sorteio = random.nextInt(101);
        System.out.println(num_sorteio);

        System.out.println("Seja Bem-vindo ao jogo!");
        while (true) {
        System.out.println("Digite um número de 0 a 100: ");
        palpite = leia.nextInt();

            if (palpite < 1 || palpite > 100) {
                System.out.println("Número inválido!");
            } else if (palpite < num_sorteio) {
                System.out.println("Digite um número maior!");
            } else if (palpite > num_sorteio) {
                System.out.println("Digite um número menor!");
            } else {
                System.out.println("Parabéns você acertou!");
                break;
            }

        }
    }
}

