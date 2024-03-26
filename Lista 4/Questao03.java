import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int pessoasAcima50 = 0;
        double somaAlturas = 0;
        int contadorAlturas = 0;
        int pessoasMenos40 = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa " + i + ":");
            System.out.print("Idade: ");
            int idade = entrada.nextInt();
            System.out.print("Altura: ");
            double altura = entrada.nextDouble();
            System.out.print("Peso (em quilos): ");
            double peso = entrada.nextDouble();
            
            if (idade > 50) {
                pessoasAcima50++;
            }
            
            if (idade >= 10 && idade <= 20) {
                somaAlturas += altura;
                contadorAlturas++;
            }
            
            if (peso < 40) {
                pessoasMenos40++;
            }
        }
        
        System.out.println("\nResultados:");
        System.out.println("Quantidade de pessoas com idade superior a 50 anos: " + pessoasAcima50);
        
        double mediaAlturas = contadorAlturas > 0 ? somaAlturas / contadorAlturas : 0;
        System.out.println("Média das alturas das pessoas com idade entre 10 e 20 anos: " + mediaAlturas + " metros");
        
        double porcentagemPesoMenos40 = (double) pessoasMenos40 / 10 * 100;
        System.out.println("Porcentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas: " + porcentagemPesoMenos40 + "%");
        
        entrada.close();
    }
}
