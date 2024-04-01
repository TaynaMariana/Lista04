/*Escreva um programa em Java que calcule o produto de A (número real) por B (número inteiro), ou seja, A*B, por intermédio de adições sucessivas. 
Tanto A quanto B devem ser fornecidos pela pessoa utilizadora do programa.*/

import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número real A: ");
        double a = entrada.nextDouble();

        System.out.print("Digite o número inteiro B: ");
        int b = entrada.nextInt();

        double produto = calcularProduto(a, b);
        System.out.println("O produto de " + a + " por " + b + " é igual a: " + produto);

        entrada.close();
    }

    public static double calcularProduto(double a, int b) {
        double produto = 0;
        boolean negativo = false;

        if (b < 0) {
            negativo = true;
            b = Math.abs(b);
        }

        for (int i = 0; i < b; i++) {
            produto += a;
        }

        if (negativo) {
            produto = -produto;
        }

        return produto;
    }
}
