/*Modifique o programa do Jogo de Adivinhação para que após cada tentativa, o programa deve informar ao usuário se o palpite é muito alto, muito baixo, 
ou correto. Uma vez que o usuário adivinhe o número corretamente, o programa perguntará se ele gostaria de jogar novamente. O usuário pode continuar 
jogando quantas vezes quiser até que escolha sair do jogo. Dica: use while(true).*/

import java.util.Random;
import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        
        while (true) {
            int numeroSecreto = random.nextInt(100) + 1;
            int tentativas = 0;

            System.out.println("Bem-vindo ao Jogo de Adivinhação!");
            System.out.println("Estou pensando em um número entre 1 e 100...");
            System.out.println("Tente adivinhar qual é!");

            int palpite;
            do {
                System.out.print("Digite seu palpite: ");
                palpite = entrada.nextInt();
                tentativas++;

                if (palpite < numeroSecreto) {
                    System.out.println("Muito baixo. Tente novamente.");
                } else if (palpite > numeroSecreto) {
                    System.out.println("Muito alto. Tente novamente.");
                } else {
                    System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas!");
                }
            } while (palpite != numeroSecreto);

            System.out.print("Você gostaria de jogar novamente? (s/n): ");
            String resposta = entrada.next();
            if (!resposta.equalsIgnoreCase("s")) {
                break;
            }
        }
        
        System.out.println("Obrigado por jogar! Até mais!");
        entrada.close();
    }
}
