import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        double peso = Double.parseDouble((JOptionPane.showInputDialog("Digite o seu peso: ")));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura: "));
        double imc = peso / (altura * altura);
        if (imc < 18.5) {
            JOptionPane.showMessageDialog(null," Classificação: Abaixo do peso" + "\n" + "IMC " + imc );
        }
        else if (imc <= 25){
            JOptionPane.showMessageDialog(null, "Classificação: Normal" + "\n" + "IMC " + imc);
        }
        else if (imc <= 30) {
            JOptionPane.showMessageDialog(null,"Classificação: Acima do peso" + "\n" + "IMC " + imc );
        }
        else {
            JOptionPane.showMessageDialog(null, "Classificão: Obeso" + "\n" + "IMC " + imc);
        }
    }
}