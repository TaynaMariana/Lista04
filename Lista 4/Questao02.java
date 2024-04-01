/*Faça um programa que leia um número indeterminado de valores e mostre o valor lido, seu quadrado,
seu cubo e sua raiz quadrada. Finalize a entrada com valor negativo ou zero.*/

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        while (true) {
            
            System.out.print("Digite um número (ou zero/negativo para encerrar): ");
            double num = entrada.nextDouble();
            
            
            if (num <= 0) {
                System.out.println("Encerrando o programa.");
                break;
            }
            
            
            double quadrado = Math.pow(num, 2);
            double cubo = Math.pow(num, 3);
            double raizQuadrada = Math.sqrt(num);
            
            
            System.out.println("Número: " + num);
            System.out.println("Quadrado: " + quadrado);
            System.out.println("Cubo: " + cubo);
            System.out.println("Raiz Quadrada: " + raizQuadrada);
            System.out.println();
        }
        
        entrada.close();
    }
}
