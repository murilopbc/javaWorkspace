import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaração de Variáveis
        double raio, area;

        // Criação do Objeto Scanner
        Scanner read = new Scanner(System.in);

        // Entrada (leitura)
        System.out.print("Informe o raio do círculo: ");
        raio = read.nextDouble();

        //Processamento
        area = 3.14 *(raio*raio);

        // Saída (escrita)
        System.out.printf("Área: %4.2f ", area);
    }
}