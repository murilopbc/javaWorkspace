import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int base, expoente;

        System.out.println("Digite a base: ");
        base = leia.nextInt();
        System.out.println("Digite o expoente: ");
        expoente = leia.nextInt();

        double resultado = 1.0;

        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

        System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);
    }
}