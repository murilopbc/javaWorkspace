import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[8];

        for (int indice = 0; indice < 8; indice++) {
            String numero = JOptionPane.showInputDialog("Digite o número " + (indice + 1 + ":"));
            numeros[indice] = Integer.parseInt(numero);
        }

        boolean numbers = false;

        StringBuilder num = new StringBuilder("Todos os valores estão entre 100 e 200!\n");
        for (int indice = 0; indice < 8; indice++) {
            if (numeros[indice] >= 100 && numeros[indice] <= 200) {
                num.append(numeros[indice]).append(" ");
                numbers = true;
            }
            else {
                break;
            }

        }
        if (numbers) {
            JOptionPane.showMessageDialog(null, num.toString());
        }
        else {
            JOptionPane.showMessageDialog(null, "Valor Inválido!");
        }
    }
}