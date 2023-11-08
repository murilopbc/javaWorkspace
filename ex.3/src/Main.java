import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int senha, senhaCorreta = 1852421;

        while (true) {
        System.out.println("Digite sua senha: ");
        senha = leia.nextInt();
            if (senha == senhaCorreta) {
                System.out.println("Senha correta!");
                break;
            }
            else {
                System.out.println("Senha inválida!");

            }

        }
    }
}