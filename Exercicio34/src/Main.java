import javax.swing.*;


        class Calculadora {
            public static void main(String[] args) {

                int opcao = 0;

                do {
                    String numero1 = JOptionPane.showInputDialog("Digite um número: ");
                    String numero2 = JOptionPane.showInputDialog("Digite um outro número: ");
                    double num1 = Double.parseDouble(numero1);
                    double num2 = Double.parseDouble(numero2);

                    if (num1 == num2) {
                        JOptionPane.showMessageDialog(null, "Erro! Os números devem ser diferentes!");
                        continue;
                    }
                    String escolha = JOptionPane.showInputDialog("Escolha uma opção:\n1-Média Aritmética\n2-Menor Número\n3-Diferença entre Maior e Menor Número\n4-Números em ordem Crescente");
                    opcao = Integer.parseInt(escolha);

                    switch (opcao) {
                        case 1:
                            media(num1, num2);
                            break;
                        case 2:
                            menor_numero(num1, num2);
                            break;
                        case 3:
                            diferenca_maior_e_menor(num1, num2);
                            break;
                        case 4:
                            ordem_crescente (num1, num2);
                            break;
                        case 5:

                        default:
                            JOptionPane.showMessageDialog(null, "Opção Inválida! Tente Novamente!");

                    }
                } while (opcao != 0);
            }
            public static void media(double num1, double num2) {
                double media = (num1 + num2) / 2;
                JOptionPane.showMessageDialog(null,"Média Aritmética: " + media);
            }
            public static void menor_numero(double num1, double num2) {
                double menor_numero = (num1 < num2) ? num1 : num2;
                JOptionPane.showMessageDialog(null, "Menor Número: " + menor_numero);
            }
            public static void diferenca_maior_e_menor(double num1, double num2) {
                double maior = (num1 > num2) ? num1: num2;
                double menor = (num1 < num2) ? num1: num2;
                double diferenca_maior_e_menor = maior - menor;
                JOptionPane.showMessageDialog(null, "Diferença entre Maior e Menor Número: " + diferenca_maior_e_menor);
            }
            public static void ordem_crescente(double num1, double num2) {
                double maior = (num1 > num2) ? num1: num2;
                double menor = (num1 < num2) ? num1: num2;
                JOptionPane.showMessageDialog(null, "Números em Ordem Crescente: "+ menor + ", " + maior);
            }
        }
