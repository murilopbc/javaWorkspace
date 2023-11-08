import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int qtd_idades = 20;

        int [] idades = new int[qtd_idades] ;

        int soma = 0;

        for(int indice = 0; indice < qtd_idades; indice++){
            String idade = JOptionPane.showInputDialog("Digite a idade " + (indice + 1));
            idades[indice] = Integer.parseInt(idade);
            soma += idades[indice];
        }

        int media = soma/qtd_idades;

        StringBuilder maior_valor = new StringBuilder("Valores maiores que a média: \n");
        for(int indice = 0; indice < qtd_idades; indice++) {
            if (idades[indice] > media) {
                maior_valor.append(idades[indice]);
            }
        }

        JOptionPane.showMessageDialog(null, maior_valor);

            }
        }
