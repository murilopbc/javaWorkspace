import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Criação da matriz 7 x 2 com números inteiros iniciados
        int [] [] temperaturas = new int[][] {
                {10, 20},
                {30, 40},
                {50, 60},
                {70, 80}};
        // variável "saida" para exibir o resultado
        String saida = "";
        // variavel contador para adicionar a quantidade desejada de repetição do loop
        int contador = 0;
        // loop for
        for (int dia = 0; dia < 7; dia++) {
            // variável "minima" que irá buscar os valores da coluna da esquerda 0
           int minima = temperaturas[dia][0];
            // variável "minima" que irá buscar os valores da coluna da direita 1
           int maxima = temperaturas[dia][1];
           // contador adicionando os valores
                contador++;
                // processamento
                saida += String.format("Dia: %d Mínima: %d graus Máxima: %d graus\n", contador,minima, maxima);
            }
        // Exibir as temperaturas mínimas e máxima de cada dia
        JOptionPane.showMessageDialog(null,saida);
        }

    }

