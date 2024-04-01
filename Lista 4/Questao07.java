/*Crie um programa em Java que exiba formas geométricas na tela. Um menu deve ser exibido com as seguintes opções: retângulo, diagonal superior esquerda, 
diagonal superior direita, diagonal inferior esquerda, diagonal inferior direita. As imagens devem ser formadas por asteriscos (*) e, a pessoa utilizadora 
deve informar a quantidade de colunas. Abaixo estão alguns exemplos das formas:
*  *  *  * 
*  *  *  *
*  *  *  *
*  *  *  *

*  *  *  * 
*  *  *  
*  *  
*  

*  *  *  * 
   *  *  *
      *   *
          *
*   
*  * 
*  *  *  
*  *  *  *

          * 
       *  *
    *  *  *
*  *  *  *
*/

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma forma geométrica:");
            System.out.println("1. Retângulo");
            System.out.println("2. Diagonal Superior Esquerda");
            System.out.println("3. Diagonal Superior Direita");
            System.out.println("4. Diagonal Inferior Esquerda");
            System.out.println("5. Diagonal Inferior Direita");
            System.out.println("6. Sair");
            System.out.print("Opção: ");
            int opcao = entrada.nextInt();

            if (opcao == 6) {
                break;
            }

            System.out.print("Digite a quantidade de colunas: ");
            int colunas = entrada.nextInt();

            switch (opcao) {
                case 1:
                    desenharRetangulo(colunas);
                    break;
                case 2:
                    desenharDiagonalSuperiorEsquerda(colunas);
                    break;
                case 3:
                    desenharDiagonalSuperiorDireita(colunas);
                    break;
                case 4:
                    desenharDiagonalInferiorEsquerda(colunas);
                    break;
                case 5:
                    desenharDiagonalInferiorDireita(colunas);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }

        System.out.println("Obrigado por utilizar o programa!");
        entrada.close();
    }

    public static void desenharRetangulo(int colunas) {
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void desenharDiagonalSuperiorEsquerda(int colunas) {
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (j <= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void desenharDiagonalSuperiorDireita(int colunas) {
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (j >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void desenharDiagonalInferiorEsquerda(int colunas) {
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (j >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void desenharDiagonalInferiorDireita(int colunas) {
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (j <= i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
