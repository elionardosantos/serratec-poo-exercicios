import java.util.Scanner;

public class ContaBancaria {

    private double saldo = 50;
    private double valorDeposito = 0;
    private double valorSaque = 0;
    private double valorSaqueMaximo = 1000;
    private int quantMaxSaques = 3;

    Scanner scanner = new Scanner(System.in);

    public void deposito() {
        System.out.print(
            "\n-------- Deposito --------" +
            "\nQuanto voce deseja depositar? R$ "
        );

        valorDeposito = scanner.nextDouble();
        saldo += valorDeposito;

        System.out.printf(
            "\n--------------------------" +
            "\nDeposito realizado com sucesso" +
            "\nNovo saldo: R$ %.2f\n", this.saldo
        );
    }

    public void saque() {
        if(quantMaxSaques > 0){
            System.out.print(
                "\n---------- Saque ---------" +
                "\nQuanto voce deseja sacar? R$ "
            );

            valorSaque = scanner.nextDouble();

            if (valorSaque > valorSaqueMaximo) {

                System.out.printf(
                    "Saque nao realizado" +
                    "\nO limite maximo e de R$ %.2f\n",
                    valorSaqueMaximo
                );

            } else if (valorSaque > saldo) {

                System.out.print(
                    "Saque nao realizado" +
                    "\nSaldo insuficiente\n"
                );

            } else {
                saldo -= valorSaque;
                quantMaxSaques--;

                System.out.printf(
                    "--------------------------" +
                    "\nSaque realizado com sucesso" +
                    "\nNovo saldo: R$ %.2f\n", saldo
                );

            }

        } else {

            System.out.println(
                "--------------------------" +
                "\nLimite de saques diarios atingido"
            );

        }

    }

    public void mostrarSaldo() {
        System.out.printf(
            "\n---------- Saldo ---------" +
            "\nSaldo: R$ %.2f\n", saldo
        );
    }

    public void encerraAcesso() {
        System.out.print(
            "--------------------------" +
            "\n---- Acesso encerrado ----" +
            "\n"
        );
    }

    public void opcaoInvalida() {
        System.out.print(
            "--------------------------" +
            "\nOpcao invalida. Tente novamente\n"
        );
    }
}
