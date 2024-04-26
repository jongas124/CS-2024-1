import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        String usuario, senha;
        Scanner scanner = new Scanner(System.in);
        Login login = new Login("user", "123");

        System.out.println("Digite o usuario: ");
        usuario = scanner.nextLine();
        System.out.println("Digite a senha: ");
        senha = scanner.nextLine();

        try {
            if(login.fazerLogin(usuario, senha)) {
                Clear.clearConsole();
                System.out.println("Login realizado com sucesso!");
            }
        } catch (LoginInvalidoException e) {
            Clear.clearConsole();
            System.out.println(e.getMessage());
            scanner.close();
            System.exit(0);
        }
        scanner.close();
    }
}
