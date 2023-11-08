import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int[] numeros = new int[10];

        for (int indice = 0; indice < 10; indice++) {
            String numero = JOptionPane.showInputDialog("Digite o número " + (indice + 1 + ":"));
            numeros[indice] = Integer.parseInt(numero);
        }

        boolean pares = false;

        StringBuilder num_par = new StringBuilder("Os valores pares são: \n");
        for (int indice = 0; indice < 10; indice++) {
            if (numeros[indice] % 2  == 0) {
                num_par.append(numeros[indice]).append(" ");
                pares = true;
            }
        }
        if (pares) {
            JOptionPane.showMessageDialog(null, num_par.toString());
        }
        else {
            JOptionPane.showMessageDialog(null, "Todos os valores são ímpares!");
        }
    }
}

