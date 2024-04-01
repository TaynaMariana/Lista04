/*Seja a seguinte série:
1, 4, 4, 2, 5, 5, 3, 6, 6, 4, 7, 7, …
a) Escreva um programa que seja capaz de gerar os N termos dessa série.
b) Esse número N deve ser lido do teclado.
*/

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de termos (N): ");
        int N = entrada.nextInt();

        System.out.println("Os primeiros " + N + " termos da série são:");
        gerarSerie(N);

        entrada.close();
    }

    public static void gerarSerie(int N) {
        int count = 1;
        int i = 1;

        while (count <= N) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                count++;
            } else {
                System.out.print((i / 2 + 3) + " ");
            }
            i++;
        }
    }
}
