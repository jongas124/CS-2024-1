import java.util.Scanner;
import java.util.InputMismatchException;

    public class Exercicio1 {
        public static void main(String[] args) {
            int dividendo = 1, divisor, resultado;
            boolean dividendoBoolean = true, verificador = true;
            Scanner scanner = new Scanner(System.in);
            while(verificador) {
                try {
                    if(dividendoBoolean) {
                        dividendo = scanner.nextInt();
                        dividendoBoolean = false;
                        Clear.clearConsole();
                    }
                    System.out.print(dividendo + "/");
                    divisor = scanner.nextInt();
                    resultado = dividendo/divisor;
                    verificador = false;
                } catch (InputMismatchException e) {
                    Clear.clearConsole();
                    System.out.println("Numero invalido digitado, por favor digite um numero valido");
                    scanner.next();
                    continue;
                } catch (ArithmeticException e) {
                    Clear.clearConsole();
                    System.out.println("Nao e possivel dividir por 0, por favor digite um numero valido");
                    continue;
                }
                System.out.println("Resultado: " + resultado);
            }

            scanner.close();
        }
}
