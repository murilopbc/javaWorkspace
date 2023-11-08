import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
        if (idade < 18) {
            JOptionPane.showMessageDialog(null, "Idade: " + idade  + "\n" + "Classificação: Juvenil");
        } else {
            JOptionPane.showMessageDialog(null, "Idade: " + idade + "\n" + "Classificação: Adulto");
        }
    }
}