package Questao03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JogoDaVelha jogo = new JogoDaVelha();

        while (jogo.isJogoEmAndamento()) {
            jogo.exibirTabuleiro();
            System.out.println("É a vez do jogador " + jogo.getJogadorAtual() + ". Informe a linha e coluna para jogar:");
            int linha = scanner.nextInt() - 1;
            int coluna = scanner.nextInt() - 1;
            jogo.fazerJogada(linha, coluna);
        }

        jogo.exibirTabuleiro();
        scanner.close();
    }
}
