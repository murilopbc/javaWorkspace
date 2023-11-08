import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Declaração de variáveis
        double qtdpicole, valorpicole = 2;

        // Entrada (leitura)
        qtdpicole = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a quantidade de picolé desejado: "));

        // Opção Sair
        if (qtdpicole == 0) {
            JOptionPane.showMessageDialog(null, "Programa finalizado!");
        } else {
            if (qtdpicole > 10) {
                valorpicole = 1.5;
                valorpicole*=qtdpicole;

                JOptionPane.showMessageDialog(null,"O valor total é: " + valorpicole);
            }
            else  {
                valorpicole *= qtdpicole;
                JOptionPane.showMessageDialog(null, "O valor total é: " + valorpicole);
            }
        }
    }
}
