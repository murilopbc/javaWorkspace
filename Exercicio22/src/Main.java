import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int tamanho = 6;
        int[] a = new int[tamanho];
        int[] b = new int[tamanho];

        for (int indice = 0; indice < tamanho; indice++) {
            String numero = JOptionPane.showInputDialog("Digite um número para o vetor A ");
            a[indice] = Integer.parseInt(numero);
        }

        for (int indice = 0; indice < tamanho; indice++) {
            b[indice] = a[indice] / 2;
        }

        StringBuilder  vetorA = new StringBuilder("Valores do vetor A:\n");
        for (int indice = 0; indice < tamanho; indice++) {
            vetorA.append(a[indice]).append(" ");

        }
        vetorA.append("\n Valores do Vetor B:\n ");
        for (int indice = 0; indice < tamanho; indice++) {
            vetorA.append(b[indice]).append(" ");
        }
        JOptionPane.showMessageDialog(null,vetorA.toString());
        }
}