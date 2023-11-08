import javax.swing.*;

public class Main {
    public static void main(String[] args) {
       int [] [] numeros = new int[3][3];
       String saida = "";
       int contador = 1;
       for (int linha = 0; linha < 3; linha++) {
           for (int coluna = 0; coluna < 3; coluna++) {
               numeros[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog(String.format("Informe o %d número (posição %d, %d)", contador, linha, coluna)));
               contador++;
               saida += String.format(" %d ", numeros[linha][coluna]);
               if (contador > 3){
                   saida += "\n";
                   contador = 1;
               }
           }

       }
       JOptionPane.showMessageDialog(null,saida);
    }
}

