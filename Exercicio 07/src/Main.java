import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));

        double ValorPassagem;
            if (idade > 60) {
            ValorPassagem = 60.0 / 2;
            }
            else {
            ValorPassagem = 60;
        }
        String mensagem = "Resumo de compra:\n";
            mensagem += "Nome do comprador: " + nome + "\n";
            mensagem += "Valor da passagem: R$" + String.format("%.2f", ValorPassagem);
            JOptionPane.showMessageDialog(null, mensagem);
    }
}