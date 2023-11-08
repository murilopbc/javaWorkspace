import javax.swing.*;

public class Main {
    public static void main(String[] args) {
String[] nomes  = {"Paulo", "Murilo", "Caio", "João", "Bruno", "Felipe", "Tiago", "Matheus", "Ken", "André"};

String novo_nome =  JOptionPane.showInputDialog("Digite um nome para procurar: ");

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
    JOptionPane.showMessageDialog(null, "Nome encontrado na posição " + indice);
}
else {
    JOptionPane.showMessageDialog(null, "Nome não encontrado!");
    }

    }
}