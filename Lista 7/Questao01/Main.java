package Questao01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar compromisso");
            System.out.println("2. Consultar compromisso");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o dia do mês (1-31): ");
                    int dia = scanner.nextInt();
                    System.out.print("Digite a hora (0-23): ");
                    int hora = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Digite o compromisso: ");
                    String descricao = scanner.nextLine();
                    agenda.adicionarCompromisso(dia, hora, descricao);
                    break;
                case 2:
                    System.out.print("Digite o dia do mês (1-31): ");
                    dia = scanner.nextInt();
                    System.out.print("Digite a hora (0-23): ");
                    hora = scanner.nextInt();
                    System.out.println("Compromisso: " + agenda.consultarCompromisso(dia, hora));
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}
