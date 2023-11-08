import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Declaração de Variáveis
        int operacao;
        double num1, num2, resultado = 0;
        Character sinal = null;
        // Criação Objeto Scanner
        Scanner leia = new Scanner(System.in);

        // Entrada (leitura)
        System.out.println("Operações");
        System.out.println("1-Adição");
        System.out.println("2-Subtração");
        System.out.println("3-Multiplicação");
        System.out.println("4-Divisão");
        System.out.print("Informe a operação desejada: ");
        operacao =  leia.nextInt();
        System.out.print("Digite o primeiro número: ");
        num1 = leia.nextDouble();
        System.out.print("Digite o segundo número: ");
        num2 = leia.nextDouble();

        // Processamento
       if (operacao == 1) {
           resultado = num1 + num2;
           sinal = '+';
       }
       if (operacao == 2) {
           resultado = num1 - num2;
           sinal = '-';
       }
       if (operacao == 3){
           resultado = num1 * num2;
           sinal = '*';
       }
       if (operacao == 4 ){
           resultado = num1 / num2;
           sinal = '/';
       }
        // Saída (escrita)
        System.out.printf("%4.2f %s %4.2f = %4.2f \n", num1, sinal, num2, resultado);
    }
}