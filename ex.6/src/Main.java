import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);
        int limite;
        System.out.println("Digite um número limite: ");
        limite = leia.nextInt();

        int soma = 0;

        for (int i = 1; i <= limite; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }

        System.out.println("A soma dos números pares de 1 até " + limite + " é: " + soma);
    }
}