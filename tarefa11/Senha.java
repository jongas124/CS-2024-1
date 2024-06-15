
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        String senha;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Senha: ");
        senha = scanner.nextLine();
        scanner.close();
        String regex = "^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[~!@#$%^&*+\\-\\/.,\\{}\\[\\]();:?<>\"'_ ]).+{8,12}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(senha);
        boolean possuiLetra = false;
        boolean possuiNumero = false;
        boolean possuiCaractereEspecial = false;
        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);
            if (Character.isLetter(c)) {
                possuiLetra = true;
            } else if (Character.isDigit(c)) {
                possuiNumero = true;
            } else if (isSpecialCharacter(c)) {
                possuiCaractereEspecial = true;
            }
        }
        if (matcher.matches()) {
            System.out.println("Senha válida");
        } else {
            System.out.println("Senha inválida");
            if (!possuiLetra) {
                System.out.println("A senha deve conter pelo menos uma letra");
            }
            if (!possuiNumero) {
                System.out.println("A senha deve conter pelo menos um número");
            }
            if (!possuiCaractereEspecial) {
                System.out.println("A senha deve conter pelo menos um caractere especial (~!@#$%^&*+-/.,{}[]();:?<>\"'_ )");
            }
            if (senha.length() < 5 || senha.length() > 30){
            	System.out.println("A senha deve ter entre 8 e 12 caracteres");
            }
        }
    }

    private static boolean isSpecialCharacter(char c) {
        String caracteresEspeciais = "~!@#$%^&*+-/.,{}[]();:?<>\"'_ ";
        return caracteresEspeciais.contains(String.valueOf(c));
    }
}