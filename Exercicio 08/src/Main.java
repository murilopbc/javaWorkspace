import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        double valorIngressoNaoSocio = 100.0;
        double valorIngressoSocio = 75.0;

        int quantidadeIngressos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de ingressos desejados:"));
        String tipoIngresso = JOptionPane.showInputDialog("Os ingressos são para sócios? (sim/não)").toLowerCase();

        double valorUnitario;
        if (tipoIngresso.equals("sim")) {
            valorUnitario = valorIngressoSocio;
        } else {
            valorUnitario = valorIngressoNaoSocio;
        }

        double valorTotal = valorUnitario * quantidadeIngressos;

        String mensagem = "Resumo da compra:\n";
        mensagem += "Quantidade de ingressos: " + quantidadeIngressos + "\n";
        mensagem += "Valor unitário: R$ " + String.format("%.2f", valorUnitario) + "\n";
        mensagem += "Valor total: R$ " + String.format("%.2f", valorTotal);

        JOptionPane.showMessageDialog(null, mensagem);
    }
}