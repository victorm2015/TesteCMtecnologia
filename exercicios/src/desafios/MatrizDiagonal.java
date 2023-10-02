package desafios;

import java.util.Scanner;

public class MatrizDiagonal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        while (true) {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Registrar entrada de valor");
            System.out.println("2 - Registrar saída de valor");
            System.out.println("3 - Verificar saldo");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor de entrada: ");
                    double entrada = scanner.nextDouble();
                    saldo += entrada;
                    System.out.println("Entrada registrada: R$" + entrada);
                    break;
                case 2:
                    System.out.print("Digite o valor de saída: ");
                    double saida = scanner.nextDouble();
                    if (saida > saldo) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        saldo -= saida;
                        System.out.println("Saída registrada: R$" + saida);
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: R$" + saldo);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}