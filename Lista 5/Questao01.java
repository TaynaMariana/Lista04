/*Faça um programa que receba várias idades, calcule e mostre a 
média das idades digitadas. Finalize digitando idade igual a zero.*/

import java.util.Scanner;

public class Questao01{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int idade, soma = 0, entrada = 0;
        double media;

        do{
            System.out.println("Digite a idade (0 para finalizar)");
            idade = scanner.nextInt();
            soma += idade;
            entrada++;
        }while(idade != 0);
        if (soma == 0) {
            System.out.println("Nenhuma idade foi informada");
        }else{
            media = soma / (entrada - 1);
            System.out.println("A soma das idades são: " + soma);
            System.out.println("A média das idades são: " + media);
        }
        System.out.println("Programa finalizado!");
        
        scanner.close();
    }
}