import javax.swing.*;

public class Main {
    public static void main(String[] args) {

int [] numeros = new int[] {10, 20, 30, 40, 50, 60, 70, 80};
int soma = 0;

        for (int numero : numeros) {
            soma += numero;
        }
int media = soma / numeros.length;
        JOptionPane.showMessageDialog(null, media,"Média",JOptionPane.INFORMATION_MESSAGE);
        }
    }
