/*Escreva um programa que: 
a) leia 100 fichas, onde cada ficha contém o número de matrícula e a nota de cada aluno de um determinado curso;
b) determine e imprima as duas maiores notas, juntamente com o número de matrícula do aluno que obteve cada uma delas; 
c) assuma que não exista dois ou mais alunos com a mesma nota;
*/

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double maiorNota = Double.MIN_VALUE;
        double segundaMaiorNota = Double.MIN_VALUE;
        int matriculaMaiorNota = 0;
        int matriculaSegundaMaiorNota = 0;

        for (int i = 1; i <= 100; i++) {
            System.out.println("Informe a matrícula do aluno " + i + ":");
            int matricula = entrada.nextInt();

            System.out.println("Informe a nota do aluno " + i + ":");
            double nota = entrada.nextDouble();

            if (nota > maiorNota) {
                segundaMaiorNota = maiorNota;
                matriculaSegundaMaiorNota = matriculaMaiorNota;
                maiorNota = nota;
                matriculaMaiorNota = matricula;
            } else if (nota > segundaMaiorNota) {
                segundaMaiorNota = nota;
                matriculaSegundaMaiorNota = matricula;
            }
        }

        System.out.println("A maior nota é: " + maiorNota + ", Matrícula do aluno: " + matriculaMaiorNota);
        System.out.println("A segunda maior nota é: " + segundaMaiorNota + ", Matrícula do aluno: " + matriculaSegundaMaiorNota);

        entrada.close();
    }
}
