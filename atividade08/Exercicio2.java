import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os valores a serem inseridos no vetor:");
        try {
            int i = 0;
            do {
                vetor[i] = scanner.nextInt();
                i++;
            } while (vetor[i-1] != 0);
            scanner.close();
        } catch (ArrayIndexOutOfBoundsException e) {
            Clear.clearConsole();
            System.out.println("O numero de dados digitado excedeu as posicoes disponiveis no vetor");
            scanner.close();
            System.exit(0);
        } catch (InputMismatchException e) {
            Clear.clearConsole();
            System.out.println("Algum numero invalido foi digitado, tente novamente");
            scanner.close();
            System.exit(0);
        }
        Clear.clearConsole();
        System.out.println("Seu vetor final e:");
        for(int i = 0; vetor[i] != 0; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}

