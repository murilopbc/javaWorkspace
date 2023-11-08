import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String[] produtos = {
                "1 - Frango grelhado: (R$ 25.00)",
                "2 - Risoto de frango: (R$ 20.00)",
                "3 - Contra Filé: (R$ 35.00)",
                "4 - Parmegiana de carne: (R$ 30.00)",
                "5 - Sobrecoxa assada: (R$ 15.00)"
        };

        double[] precos = {25.00, 20.00, 35.00, 30.00, 15.00};

        // Solicitar ao usuário que faça um pedido
        String pedido = JOptionPane.showInputDialog(null, "Cardápio:\n" +
                String.join("\n", produtos) + "\n\nDigite o código do produto:");

        // Converter o pedido em um número inteiro
        int codigoPedido = Integer.parseInt(pedido);

        // Quantidade desejada
        String quantidadeStr = JOptionPane.showInputDialog(null, "Digite a quantidade desejada:");
        int quantidade = Integer.parseInt(quantidadeStr);

        // Calcular o valor total do pedido
        double total = precos[codigoPedido - 1] * quantidade;

        // Gerar a nota fiscal
        String notaFiscal = "Nota Fiscal:\n";
        notaFiscal += "Produto: " + produtos[codigoPedido - 1] + "\n";
        notaFiscal += "Quantidade: " + quantidade + "\n";
        notaFiscal += "Total: R$ " + total;

        // Exibir a nota fiscal
        JOptionPane.showMessageDialog(null, notaFiscal, "Nota Fiscal", JOptionPane.INFORMATION_MESSAGE);
    }
}
