/*Faça um programa que preencha um vetor com nove números inteiros, calcule e 
mostre os números primos e suas respectivas posições. */

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Preenchendo o vetor com nove números inteiros
        int[] vetor = new int[9];
        System.out.println("Digite nove números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }
        
        System.out.println("Números primos e suas posições:");
        for (int i = 0; i < vetor.length; i++) {
            int num = vetor[i];
            boolean primo = true;
            if (num <= 1) {
                primo = false;
            } else {
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        primo = false;
                        break;
                    }
                }
            }
            if (primo) {
                System.out.println("Número primo: " + num + ", posição: " + i);
            }
        }

        scanner.close();
    }
}
