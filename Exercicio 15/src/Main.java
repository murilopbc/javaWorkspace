import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[]{5, 10, 15, 20, 25};
        StringBuilder resultado = new StringBuilder();
        for (int numero : numeros) {
            resultado.append(String.format("%d%n", numero * 2));
        }
        JOptionPane.showMessageDialog(null, resultado.toString(), "Vetor", JOptionPane.INFORMATION_MESSAGE);
    }
}
