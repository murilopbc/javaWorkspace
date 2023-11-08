import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int inicio, fim, contador;

        inicio = Integer.parseInt(JOptionPane.showInputDialog("Digite um número incial: "));
        fim = Integer.parseInt(JOptionPane.showInputDialog("Digite um número final: "));

        for(contador = inicio; contador <= fim; contador+=3) {

            JOptionPane.showMessageDialog(null,contador);

        }
    }
}