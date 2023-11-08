import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo: ");
        int num = leia.nextInt();
        if (num < 0) {
            System.out.println("Número inválido!");
        }
        else {
            long fatorial =1;
            int contador = 1;

            while(contador <= num){
                fatorial *= contador;
                contador ++;
            }
            System.out.println("Fatorial do número "+ num + ": "+ fatorial);

        }
    }
}