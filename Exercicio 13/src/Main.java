import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int idade, somaIdade = 0, maiorIdade = 0;

        do {
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));

            if (idade > maiorIdade){
                maiorIdade = idade;
            }

            somaIdade = somaIdade + idade;

        }while (somaIdade <= 100);

        JOptionPane.showMessageDialog(null, "A maior idade é: " + maiorIdade);
    }
}