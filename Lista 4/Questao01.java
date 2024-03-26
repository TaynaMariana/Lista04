import java.util.Scanner;

public class Questao01{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);

        int num, impares = 1, pares = 0;

        while (true) {
            System.out.println("Informe número inteiro positivo (ou número negativo para encerrar)");
            num = entrada.nextInt(); 

            if (num < 0) {
                break;
            }
            if (num %2 != 0) {
                impares *= num;
            }
            else{
                pares += num;
            }
        }

        System.out.println("O produto dos números ímpares é: " + impares);
        System.out.println("A soma dos números pares é: " + pares);
    }
}