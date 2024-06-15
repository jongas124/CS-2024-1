
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String login;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Login: ");
        login = scanner.nextLine();
        scanner.close();
        String regex = "^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[~!@#$%^&*+\\-\\/.,\\{}\\[\\]();:?<>\"'_ ]).+{5,30}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(login);
        boolean possuiLetra = false;
        boolean possuiNumero = false;
        boolean possuiCaractereEspecial = false;
        for (int i = 0; i < login.length(); i++) {
            char c = login.charAt(i);
            if (Character.isLetter(c)) {
                possuiLetra = true;
            } else if (Character.isDigit(c)) {
                possuiNumero = true;
            } else if (isSpecialCharacter(c)) {
                possuiCaractereEspecial = true;
            }
        }
        if (matcher.matches()) {
            System.out.println("Login válido");
        } else {
            System.out.println("Login inválido");
            if (!possuiLetra) {
                System.out.println("O login deve conter pelo menos uma letra");
            }
            if (!possuiNumero) {
                System.out.println("O login deve conter pelo menos um número");
            }
            if (!possuiCaractereEspecial) {
                System.out.println("O login deve conter pelo menos um caractere especial (~!@#$%^&*+-/.,{}[]();:?<>\"'_ )");
            }
            if (login.length() < 5 || login.length() > 30){
            	System.out.println("O login deve ter entre 5 e 30 caracteres");
            }
        }
    }

    private static boolean isSpecialCharacter(char c) {
        String caracteresEspeciais = "~!@#$%^&*+-/.,{}[]();:?<>\"'_ ";
        return caracteresEspeciais.contains(String.valueOf(c));
    }
}