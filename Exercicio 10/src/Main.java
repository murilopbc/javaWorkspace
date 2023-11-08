import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int periodoHospedagem = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de dias de hospedagem: "));
        int diaria = 200;

        if (periodoHospedagem > 10) {
            diaria = diaria + (10 * periodoHospedagem);
            JOptionPane.showMessageDialog(null, "O valor total da hospedagem é: R$" + diaria);
            }
        else if (periodoHospedagem == 10) {
           diaria = diaria + (15 * periodoHospedagem);
            JOptionPane.showMessageDialog( null, "O valor total da hospedagem é: R$ " + diaria);
        }
        else {
            diaria = diaria + (20 * periodoHospedagem);
            JOptionPane.showMessageDialog(null, "O valor total da hospedagem é: R$" + diaria);
                }
        }
    }
