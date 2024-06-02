package Questao04;

import java.util.Scanner;

public class MatrizFlutuante {
    private float[][] matriz;

    public MatrizFlutuante(int linhas, int colunas) {
        this.matriz = new float[linhas][colunas];
    }

    public void preencherMatriz(Scanner scanner) {
        System.out.println("Preencha a matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o elemento da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextFloat();
            }
        }
    }

    public float[][] getMatriz() {
        return matriz;
    }
}
