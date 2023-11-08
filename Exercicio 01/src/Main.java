import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Declaração de variáveis
        int dias,horas;

        //Criação do objeto Scanner
        Scanner leia = new Scanner (System.in);

        // Entrada
        System.out.print("Digite o número de dias que durou a viagem: ");
        dias = leia.nextInt();
        System.out.print("Quantas horas da viagem: ");
        horas = leia.nextInt();

        //Processamento
        horas += dias*24;

        //Saída
        System.out.printf("A viagem durou %d ", horas);

    }
}