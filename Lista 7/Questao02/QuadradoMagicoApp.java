package Questao02;

import java.util.Scanner;

public class QuadradoMagicoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho;
        int[][] valores;

        System.out.print("Digite o tamanho da matriz: ");
        tamanho = scanner.nextInt();
        valores = new int[tamanho][tamanho];

        System.out.println("Digite os valores da matriz:");

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print("Valor para a posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                valores[i][j] = scanner.nextInt();
            }
        }

        MatrizQuadradoMagico matrizQuadradoMagico = new MatrizQuadradoMagico(tamanho);
        matrizQuadradoMagico.preencherMatriz(valores);

        System.out.println("A matriz é um quadrado mágico? " + (matrizQuadradoMagico.verificaQuadradoMagico() ? "Sim" : "Não"));

        System.out.println("Matriz:");
        matrizQuadradoMagico.imprimirMatriz();

        scanner.close();
    }
}
