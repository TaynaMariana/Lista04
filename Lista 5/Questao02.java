/*Foi feita uma pesquisa sobre a audiência de canal de TV em várias casas de uma cidade, em determinado dia. Para cada 
casa consultada foi fornecido o número do canal (4, 5, 7, 12) e o número de pessoas que estavam assistindo aquele canal. 
Se a televisão estivesse desligada, nada era anotado, ou seja, essa casa não entrava na pesquisa. Faça um programa que:
leia um número indeterminado de dados (número do canal e número de pessoas que estavam assistindo); e
calcule e mostre a porcentagem de audiência de cada canal.
Para encerrar a entrada de dados, digite o número do canal ZERO.
 */

 import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializando variáveis para armazenar o total de pessoas assistindo cada canal
        int canal4 = 0, canal5 = 0, canal7 = 0, canal12 = 0;
        int totalPessoas = 0;

        // Loop para ler os dados até que o número do canal digitado seja ZERO
        while (true) {
            System.out.print("Digite o número do canal (4, 5, 7, 12) ou ZERO para encerrar: ");
            int numeroCanal = scanner.nextInt();
            if (numeroCanal == 0) {
                break; // Encerra o loop se o número do canal for ZERO
            }

            // Verifica se o número do canal é válido
            if (numeroCanal != 4 && numeroCanal != 5 && numeroCanal != 7 && numeroCanal != 12) {
                System.out.println("Número do canal inválido. Tente novamente.");
                continue; // Volta ao início do loop para pedir um novo número de canal
            }

            System.out.print("Digite o número de pessoas assistindo: ");
            int numeroPessoas = scanner.nextInt();

            // Incrementa o total de pessoas assistindo cada canal
            switch (numeroCanal) {
                case 4:
                    canal4 += numeroPessoas;
                    break;
                case 5:
                    canal5 += numeroPessoas;
                    break;
                case 7:
                    canal7 += numeroPessoas;
                    break;
                case 12:
                    canal12 += numeroPessoas;
                    break;
            }

            totalPessoas += numeroPessoas; // Incrementa o total de pessoas assistindo
        }

        // Calcula e exibe a porcentagem de audiência de cada canal
        System.out.println("\n--- Audiência por Canal ---");
        if (totalPessoas > 0) {
            System.out.println("Canal 4: " + ((double) canal4 / totalPessoas * 100) + "%");
            System.out.println("Canal 5: " + ((double) canal5 / totalPessoas * 100) + "%");
            System.out.println("Canal 7: " + ((double) canal7 / totalPessoas * 100) + "%");
            System.out.println("Canal 12: " + ((double) canal12 / totalPessoas * 100) + "%");
        } else {
            System.out.println("Nenhuma pessoa assistindo.");
        }

        scanner.close();
    }
}
