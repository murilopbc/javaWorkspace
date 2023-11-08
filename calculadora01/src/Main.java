import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaracao das variaveis
        String nome, operacao;
        double n1, n2, r;

        // Criacao do objeto Scanner
        Scanner leia = new Scanner (System.in);

        // Entrada (leitura)
        System.out.print("Digite o 1° número: ");
        n1 = leia.nextDouble();
        System.out.print("Digite o 2° número: ");
        n2 = leia.nextDouble();

        //Processamento
        r = n1 + n2;

        // Saída (escrita)
        System.out.print("Resultado: " + r);



    }
}