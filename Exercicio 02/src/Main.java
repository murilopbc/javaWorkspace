import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Declaração de Variáveis
        float conta, qtdClientes;

        // Criação do Objeto Scanner
        Scanner leia = new Scanner(System.in);

        // Entrada (leitura)
        System.out.print("Informe o valor da conta: ");
        conta = leia.nextFloat();
        System.out.print("Informe a quantidade de pessoas: ");
        qtdClientes = leia.nextFloat();

        // Processamento
        // Saída (Escrita)
        System.out.printf("Valor por cliente R$ %4.2f", conta / qtdClientes);
    }
}