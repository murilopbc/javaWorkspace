import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);

        System.out.println("Escolha um padrão (1 para triângulo, 2 para quadrado, 3 para losango):");
        int escolha = leia.nextInt();

        switch (escolha) {
            case 1:
                imprimirTriangulo();
                break;
            case 2:
                imprimirQuadrado();
                break;
            case 3:
                imprimirLosango();
                break;
            default:
                System.out.println("Escolha inválida. Por favor, escolha 1, 2 ou 3.");
        }
    }

    public static void imprimirTriangulo() {
        int altura = 5;
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void imprimirQuadrado() {
        int lado = 5;
        for (int i = 1; i <= lado; i++) {
            for (int j = 1; j <= lado; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void imprimirLosango() {
        int altura = 5;
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = altura - 1; i >= 1; i--) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
