import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        float conta, qtdClientes;
        String garcon;

        garcon = JOptionPane.showInputDialog(null,"Digite seu nome","Entrada",JOptionPane.WARNING_MESSAGE);

        conta = Float.parseFloat( JOptionPane.showInputDialog("Informe o valor da conta:") );
        qtdClientes = Float.parseFloat( JOptionPane.showInputDialog("Informe a quantidade de pessoas:") );

        JOptionPane.showMessageDialog(null,
                "Garçon: " + garcon + "\nValor por cliente R$ " + (conta / qtdClientes));

    }
}