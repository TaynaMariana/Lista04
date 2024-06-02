package Questao02;

public class MatrizQuadradoMagico {
    private int[][] matriz;

    public MatrizQuadradoMagico(int tamanho) {
        matriz = new int[tamanho][tamanho];
    }

    public void preencherMatriz(int[][] valores) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = valores[i][j];
            }
        }
    }

    public boolean verificaQuadradoMagico() {
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;

        // Verifica as somas das diagonais
        for (int i = 0; i < matriz.length; i++) {
            somaDiagonalPrincipal += matriz[i][i];
            somaDiagonalSecundaria += matriz[i][matriz.length - 1 - i];
        }

        // Verifica se as diagonais têm a mesma soma
        if (somaDiagonalPrincipal != somaDiagonalSecundaria) {
            return false;
        }

        // Verifica as somas das linhas e colunas
        for (int i = 0; i < matriz.length; i++) {
            int somaLinha = 0;
            int somaColuna = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                somaLinha += matriz[i][j];
                somaColuna += matriz[j][i];
            }
            if (somaLinha != somaDiagonalPrincipal || somaColuna != somaDiagonalPrincipal) {
                return false;
            }
        }

        return true;
    }

    public void imprimirMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
