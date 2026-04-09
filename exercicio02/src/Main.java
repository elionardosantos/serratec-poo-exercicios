import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.print(
                "\n---------- Menu ----------" +
                "\nEscolha uma das opcoes abaixo:" +
                "\n1. Ver saldo" +
                "\n2. Depositar" +
                "\n3. Sacar" +
                "\n0. Sair" +
                "\n> "
            );

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    conta.mostrarSaldo();
                    break;

                case 2:
                    conta.deposito();
                    break;

                case 3:
                    conta.saque();
                    break;

                case 0:
                    conta.encerraAcesso();
                    break;

                default:
                    conta.opcaoInvalida();
                    break;
            }

        } while (opcao != 0);
        scanner.close();
    }
}