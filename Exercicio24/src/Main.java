import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int tamanho = 5;

        int[] x = new int[] {50, 70, 30, 60, 100};
        int[] y = new int[] {90, 50, 100, 30, 80};


        int[] vetorZ = new int[2 * tamanho];
        int v = 0;

        for (int indice = 0; indice < tamanho; indice++) {
            vetorZ[v++] = x[indice];
            vetorZ[v++] = y[indice];
        }

        StringBuilder vetores = new StringBuilder("Valores simultâneos dos vetores A e B:\n");

        for (int indice = 0; indice < tamanho; indice++) {
            vetores.append("[X").append(indice + 1).append("]: ").append(x[indice]).append(("\t"));
            vetores.append("[Y").append(indice + 1).append("]: ").append(y[indice]).append(("\n"));

        }
        vetores.append(("\nValores do Vetor Z:\n"));
        for (int valor : vetorZ) {
            vetores.append(valor).append("\n");
        }

        JOptionPane.showMessageDialog(null, vetores.toString());
    }
}