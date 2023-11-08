import javax.swing.*;

public class Main {
    public static void main(String[] args) {

int [][] matrizA = new int[][] {
        {5, 10, 15},
        {20, 25, 30},
        {35, 40, 45}};

int [][] matrizB = new int[3][3];

String dobro = "";

 for ( int linha = 0; linha < 3; linha++) {
     for ( int coluna = 0; coluna < 3; coluna++){
      matrizB[linha][coluna] = matrizA[linha][coluna] * 2;
      dobro +=  "A" + "["+ linha + "," + coluna + "] : " + matrizA[linha][coluna] + " = B"+ "[" + linha + "," + coluna +"] : " + matrizB[linha][coluna] + "\n";

     }
 }
        JOptionPane.showMessageDialog(null,dobro);
    }
}