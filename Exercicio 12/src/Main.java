import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // while
        int qtdAluno = 0;
        double nota, media, somaNota = 0;

        while (true) {
            nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da prova de matemática do bimestre: "));

            if (nota < 0 ) {
                break;
            }

            qtdAluno++;
            somaNota = somaNota + nota;
        }

        media = somaNota / qtdAluno;

        JOptionPane.showMessageDialog(null, "Você inseriu " + qtdAluno + " notas e a média da sala na prova foi " + media);
        }
    }
