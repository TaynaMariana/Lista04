package Questao04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MatrizFlutuante matriz = new MatrizFlutuante(4, 4);

        while (true) {
            System.out.println("\n1. Preencher matriz");
            System.out.println("2. Exibir diagonal principal");
            System.out.println("3. Exibir diagonal secundária");
            System.out.println("4. Exibir matriz transposta");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    matriz.preencherMatriz(scanner);
                    break;
                case 2:
                    MatrizOperacoes.exibirDiagonalPrincipal(matriz.getMatriz());
                    break;
                case 3:
                    MatrizOperacoes.exibirDiagonalSecundaria(matriz.getMatriz());
                    break;
                case 4:
                    float[][] transposta = MatrizOperacoes.calcularTransposta(matriz.getMatriz());
                    MatrizOperacoes.exibirMatriz(transposta);
                    break;
                case 5:
                    System.out.println("Programa encerrado.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
