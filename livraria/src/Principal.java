import javax.swing.*;

public class Principal {
    public static void main(String args []) {

        Cliente cliente = new Cliente();
        Cliente cliente2 = new Cliente();

        cliente.setNome("Murilo");
        cliente.setEmail("murilo@gmail.com");
        cliente.setTelefone("(19) 1234-5678");

        cliente2.setNome("Caio");
        cliente2.setEmail("caio@gmail.com");
        cliente2.setTelefone( "(19) 3456-7895");



        JOptionPane.showMessageDialog(null, cliente.obterContatos());
        JOptionPane.showMessageDialog(null,cliente2.obterContatos());
    }
}
