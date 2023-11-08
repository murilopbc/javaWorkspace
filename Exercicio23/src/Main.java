import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int tamanho = 5;
        int[] a = new int[tamanho];
        int[] b = new int[tamanho];

        for (int indice = 0; indice < tamanho; indice++) {
            String numero = JOptionPane.showInputDialog("Digite o número " + (indice + 1) + " para o vetor A: ");
            a[indice] = Integer.parseInt(numero);
        }

        for (int indice = 0; indice < tamanho; indice++) {
            String numero = JOptionPane.showInputDialog("Digite o número " + (indice + 1 ) + " para o vetor B: ");
            b[indice] = Integer.parseInt(numero);
        }

        int[] vetorC = new int[2 * tamanho];
        int i = 0;

        for (int indice = 0; indice < tamanho; indice++) {
            vetorC[i++] = a[indice];
            vetorC[i++] = b[indice];
        }

        StringBuilder vetores = new StringBuilder("Valores alternados do vetor C:\n");
        for (int valor : vetorC) {
            vetores.append(valor).append("\n");
        }

        JOptionPane.showMessageDialog(null, vetores.toString());
    }
}
