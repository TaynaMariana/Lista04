package Questao04;

public class MatrizOperacoes {
    public static void exibirDiagonalPrincipal(float[][] matriz) {
        System.out.println("Diagonal Principal:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
    }

    public static void exibirDiagonalSecundaria(float[][] matriz) {
        System.out.println("Diagonal Secundária:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][matriz.length - 1 - i] + " ");
        }
        System.out.println();
    }

    public static float[][] calcularTransposta(float[][] matriz) {
        float[][] transposta = new float[matriz.length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                transposta[i][j] = matriz[j][i];
            }
        }
        return transposta;
    }

    public static void exibirMatriz(float[][] matriz) {
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
