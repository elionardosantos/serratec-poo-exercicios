import Entity.Caminhao;
import Entity.CarroPasseio;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Instanciando lista de carros
        List<CarroPasseio> carros = List.of(
                new CarroPasseio("ABC1D234", "Ford", 2001, 100.0, 100000.0),
                new CarroPasseio("BCD2E345", "Volkswagen", 2015, 200.0, 200000.0),
                new CarroPasseio("CDE3F456", "BMW", 2026, 300.0, 300000.0)
        );

        // Instanciando lista de caminhões
        List<Caminhao> caminhoes = List.of(
                new Caminhao("DEF4G567", "MAN", 2003, 400.0, 400000.0, 8.0),
                new Caminhao("EFG5H678", "VOLVO", 2021, 500.0, 500000.0, 12.0)
        );

        Scanner sc = new Scanner(System.in);
        int opcaoMenu = -1;

            do {
                try {
                    System.out.print(
                            "\n-------------- Menu principal --------------" +
                                    "\nEscolha uma opção:" +
                                    "\n1. Calcular aluguel dos carros" +
                                    "\n2. Calcular aluguel dos Caminhões" +
                                    "\n3. Calcular IPVA dos carros" +
                                    "\n4. Calcular IPVA dos caminhões" +
                                    "\n0. Sair" +
                                    "\n-> "
                    );

                    opcaoMenu = sc.nextInt();

                    switch (opcaoMenu) {

                        case 1:
                            System.out.print(
                                    "\n------------- Aluguel de carros ------------" +
                                            "\nDigite a quantidade de dias para calcular: -> ");
                            int qtDiasCarros = sc.nextInt();

                            System.out.println("Exibindo valores referentes a " + qtDiasCarros + " dia(s) de aluguel");
                            carros.forEach(carro -> {
                                System.out.printf(
                                        "\nPlaca: %s -> Valor: %.2f -> Marca: %s",
                                        carro.getPlaca(),
                                        carro.alugarVeiculo(0.0, qtDiasCarros),
                                        carro.getMarca()
                                );
                            });
                            System.out.println();
                            break;

                        case 2:
                            System.out.print("\n------------- Aluguel de caminhões ------------");

                            System.out.print("\nDigite a quantidade de dias para calcular: -> ");
                            int qtDiasCaminhoes = sc.nextInt();

                            System.out.print("Digite o peso da carga em toneladas: -> ");
                            double pesoCarga = sc.nextDouble();

                            System.out.println("Exibindo valores referentes a " + qtDiasCaminhoes + " dia(s) de aluguel");

                            caminhoes.forEach(caminhao -> {
                                System.out.printf(
                                        "\nPlaca: %s -> Valor: %.2f -> Marca: %s",
                                        caminhao.getPlaca(),
                                        caminhao.alugarVeiculo(pesoCarga, qtDiasCaminhoes),
                                        caminhao.getMarca()
                                );
                            });
                            System.out.println(); // Espaçamento entre a lista de IPVA e o menu principal
                            break;

                        case 3:
                            System.out.println("\n--------- Valor de IPVA dos carros ---------");
                            carros.forEach(carro -> {
                                System.out.printf(
                                        "\nPlaca: %s -> Valor IPVA: %.2f -> Marca: %s",
                                        carro.getPlaca(),
                                        carro.calcularIpva(),
                                        carro.getMarca()
                                );
                            });
                            System.out.println(); // Espaçamento entre a lista de IPVA e o menu principal
                            break;

                        case 4:
                            System.out.println("\n-------- Valor de IPVA dos caminhões -------");
                            caminhoes.forEach(caminhao -> {
                                System.out.printf(
                                        "\nPlaca: %s -> Valor IPVA: %.2f -> Marca: %s",
                                        caminhao.getPlaca(),
                                        caminhao.calcularIpva(),
                                        caminhao.getMarca()
                                );
                            });
                            System.out.println(); // Espaçamento entre a lista de IPVA e o menu principal
                            break;

                        case 0:
                            System.out.println("------------ Programa finalizado -----------");
                            break;

                        default:
                            System.out.println(
                                    "\n-------------- Opção inválida --------------" +
                                            "\nTente novamente"
                            );
                    }

                } catch (InputMismatchException exception) {

                System.out.println(
                        "\n-------------- Opção inválida --------------" +
                                "\nTente novamente"
                );
                sc.next();

            }

            } while (opcaoMenu != 0);

    }

}
