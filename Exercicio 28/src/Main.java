import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        
        int [][] matriz = new int[2][2];

        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                matriz[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número na posição " + (linha + "," + coluna)));

                }
            }

        int maiorNumero = matriz[0][0];

        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                if (matriz[linha][coluna] > maiorNumero) {
                    maiorNumero = matriz[linha][coluna];
                }
            }
        }
        JOptionPane.showMessageDialog(null,"O maior número da matriz é o nº " + maiorNumero);
    }
}