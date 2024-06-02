package Questao03;

public class JogoDaVelha {
    private char[][] tabuleiro;
    private char jogadorAtual;
    private boolean jogoEmAndamento;

    public JogoDaVelha() {
        tabuleiro = new char[3][3];
        jogadorAtual = 'X';
        jogoEmAndamento = true;
        inicializarTabuleiro();
    }

    private void inicializarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = '-';
            }
        }
    }

    public void exibirTabuleiro() {
        System.out.println("Tabuleiro:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean fazerJogada(int linha, int coluna) {
        if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != '-') {
            System.out.println("Jogada inválida! Tente novamente.");
            return false;
        }
        tabuleiro[linha][coluna] = jogadorAtual;
        if (verificarVencedor()) {
            System.out.println("Parabéns, o jogador " + jogadorAtual + " venceu!");
            jogoEmAndamento = false;
        } else if (verificarEmpate()) {
            System.out.println("O jogo terminou em empate!");
            jogoEmAndamento = false;
        } else {
            jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
        }
        return true;
    }

    private boolean verificarVencedor() {
        // Verificar linhas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2] && tabuleiro[i][0] != '-') {
                return true;
            }
        }
        // Verificar colunas
        for (int j = 0; j < 3; j++) {
            if (tabuleiro[0][j] == tabuleiro[1][j] && tabuleiro[1][j] == tabuleiro[2][j] && tabuleiro[0][j] != '-') {
                return true;
            }
        }
        // Verificar diagonais
        if ((tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2] && tabuleiro[0][0] != '-') ||
            (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0] && tabuleiro[0][2] != '-')) {
            return true;
        }
        return false;
    }

    private boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isJogoEmAndamento() {
        return jogoEmAndamento;
    }

    public char getJogadorAtual() {
        return jogadorAtual;
    }
}
