import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner leia = new Scanner(System.in);

        int menu;

        do {
            System.out.println("Cardápio do dia!");
            System.out.println("1 - Frango grelhado");
            System.out.println("2 - Carne Moída");
            System.out.println("3 - Contra Filé");
            System.out.println("4 - Escondidinho de frango");
            System.out.println("5 - Ovo");
            System.out.println("6 - Sair");

            System.out.println("Escolha uma das opções acima de mistura: ");
            menu = leia.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("1 - Frango grelhado");
                    break;
                case 2:
                    System.out.println("2 - Carne Moída");
                    break;
                case 3:
                    System.out.println("3 - Contra Filé");
                    break;
                case 4:
                    System.out.println("4 - Escondidinho de frango");
                    break;
                case 5:
                    System.out.println("5 - Ovo");
                    break;
                case 6:
                    System.out.println("6 - Sair");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");

            }

        } while (menu != 6) ;

    }
}
