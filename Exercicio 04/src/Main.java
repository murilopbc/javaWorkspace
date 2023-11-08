import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Declaração de Variáveis
        double preco, desconto, acrescimo;

       // Criação do objeto Scanner
        Scanner leia = new Scanner(System.in);

       // Entrada (leitura)
        System.out.print("Digite o valor do ingresso: ");
        preco = leia.nextDouble();

       // Processamento
        desconto = preco - (preco * 0.1);
        acrescimo = preco * 1.05;

       // Saída (escrita)
        System.out.printf("Preço normal: R$ %4.2f", preco);
        System.out.printf("\nQuartas-feiras: R$ %4.2f", desconto);
        System.out.printf("\nFinais de semana: R$ %4.2f", acrescimo);

    }
}