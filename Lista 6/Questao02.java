/*Faça um programa que preencha dois vetores de dez elementos numéricos cada um 
e mostre o vetor resultante da intercalação deles. */

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor1 = new int[10];
        System.out.println("Digite os valores do primeiro vetor: ");
        for(int i = 0; i < vetor1.length; i++){
            vetor1[i] = scanner.nextInt();
        }

        int[] vetor2 = new int[10];
        System.out.println("Digite os valores do segundo vetor: ");
        for(int i = 0; i < vetor2.length; i++){
            vetor2[i] = scanner.nextInt();
        }

        int[] vetorIntercalado = new int[20];
        int index = 0;
        for(int i = 0; i < 10; i++){
            vetorIntercalado[index++] = vetor1[i];
            vetorIntercalado[index++] = vetor2[i];
        }

        System.out.println("Vetor resultante da intercalação");
        for(int i = 0; i < vetorIntercalado.length; i++){
            System.out.println(vetorIntercalado[i] + " ");
        }

        scanner.close();
    }
}
