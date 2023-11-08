import java.util.Scanner;

public class Main {

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int inicio, fim;
        System.out.println("Digite um número para início: ");
        inicio = leia.nextInt();
        System.out.println("Digite um número para fim: " );
        fim = leia.nextInt();


        System.out.println("Números primos no intervalo de " + inicio + " a " + fim + ":");

        for (int numero = inicio; numero <= fim; numero++) {
            if (ehPrimo(numero)) {
                System.out.print(numero + " ");
            }
        }
    }
}