import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int operacao;
        double valor;
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria(10000);

        Clear.clearConsole();
        System.out.println("Qual operacao deseja realizar?");
        System.out.println("1 - Sacar");
        System.out.println("2 - Depositar");
        operacao = scanner.nextInt();
        if(operacao == 1) {
            try {
                Clear.clearConsole();
                System.out.print("Digite o valor a ser sacado: ");
                valor = scanner.nextDouble();
                conta.sacar(valor);
                Clear.clearConsole();
                System.out.println("Saque realizado com sucesso! \nSaldo atual: " + conta.getSaldo());
            } catch (SaldoInsuficienteException e) {
                Clear.clearConsole();
                System.out.println(e.getMessage());
                System.exit(0);
            }
            
        } else if(operacao == 2) {
            System.out.print("Digite o valor a ser sacado: ");
                valor = scanner.nextDouble();
                conta.depositar(valor);
                Clear.clearConsole();
                System.out.println("Deposito realizado com sucesso! \nSaldo atual: " + conta.getSaldo());
        } else {
            System.out.println("Erro: operacao invalida selecionada");
            Clear.clearConsole();
        }
        scanner.close();
        System.exit(0);
    }
}
