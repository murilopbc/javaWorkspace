import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int numero;

        System.out.println("Digite a tabuada desejada: ");
        numero = leia.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;

            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
