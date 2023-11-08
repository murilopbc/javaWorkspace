import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[][]{
                        {10, 20},
                        {30, 40},
                        {50, 60},
                        {70, 80}};

        StringBuilder saida = new StringBuilder();

        for (int linha = 0; linha < 4; linha++) {
            int soma = 0;
            for (int coluna = 0; coluna < 2; coluna++) {
                soma += matriz[linha][coluna];

            }

            saida.append(String.format("%d  %d  = %d\n", matriz[linha][0],matriz[linha][1], soma));

        }
        JOptionPane.showMessageDialog(null,saida);

            }
        }
