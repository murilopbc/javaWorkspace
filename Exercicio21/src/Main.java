import javax.swing.*;

public class Main {
    public static void main(String[] args) {
            String[] nomes = {"Paulo", "Murilo", "Caio", "João", "Bruno", "Felipe", "Tiago", "Matheus", "Ken", "André"};
            int chances = 5;
            while (chances > 0) {
            String novo_nome = JOptionPane.showInputDialog("Digite um nome para procurar: ");

            boolean encontrado = false;
            int indice = -1;

            for (int i = 0; i < nomes.length; i++) {
                if (nomes[i].equalsIgnoreCase(novo_nome)) {

                    encontrado = true;
                    indice = i;
                    break;
                }
            }
             if (encontrado) {
                int tentativa = 5 - chances + 1;
                JOptionPane.showMessageDialog(null, "Nome encontrado na posição " + indice + " na tentativa " + tentativa);
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Nome não encontrado. Você tem mais " + (chances - 1)+ " tentativas");
                chances--;

            }
        }
            if (chances == 0) {
            JOptionPane.showMessageDialog(null,"Infelizmente acabou suas chances. Nome não encontrado!");
         }
    }
}
