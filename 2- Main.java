import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa:");
        String nome = scanner.nextLine();

        System.out.println("Digite o número da conta:");
        String numeroConta = scanner.nextLine();

        System.out.println("Digite o saldo inicial:");
        double saldoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(nome, numeroConta, saldoInicial);

        int opcao;

        do {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1 - Depositar valor");
            System.out.println("2 - Sacar valor");
            System.out.println("3 - Obter saldo disponível");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a depositar:");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.println("Digite o valor a sacar:");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    conta.exibirSaldo();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
