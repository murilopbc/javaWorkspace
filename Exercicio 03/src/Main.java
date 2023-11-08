import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Declaração Variável
        double preco, aVista, parcela;
        // Scanner
        Scanner leia = new Scanner (System.in);

        // Entrada
        System.out.print("Informe o preço do produto: ");
        preco = leia.nextDouble();

        // Processamento
        aVista = preco - (preco * 0.90);
        parcela = preco / 3;

        // Saída
        System.out.printf("Valor original: R$ %4.2f" , preco);
        System.out.printf("\naVista: R$ %4.2f" , aVista);
        System.out.printf("\nparcela: R$ %4.2f" , parcela);
    }
}