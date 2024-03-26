import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int killsTotal = 0;
        int deathsTotal = 0;
        int assistsTotal = 0;
        boolean winner = false;
        
        while (!winner) {
            System.out.println("Digite o número de kills da rodada:");
            int killsRodada = entrada.nextInt();
            System.out.println("Digite o número de deaths da rodada:");
            int deathsRodada = entrada.nextInt();
            System.out.println("Digite o número de assists da rodada:");
            int assistsRodada = entrada.nextInt();
            
            killsTotal += killsRodada;
            deathsTotal += deathsRodada;
            assistsTotal += assistsRodada;
            
            
            if (killsTotal <= 5) {
                System.out.println("Noob");
            } else if (killsTotal >= 20) {
                System.out.println("Master");
            }
            
            if (deathsTotal >= 20) {
                System.out.println("Houston, we have a problem");
            }
            
            if (assistsTotal >= 20) {
                System.out.println("Team work");
            }
            
            
            System.out.println("Há um vencedor? (s/n)");
            char resposta = entrada.next().charAt(0);
            if (resposta == 's' || resposta == 'S') {
                winner = true;
                System.out.print("Fim do campeonato.");
            }
        }
        
        entrada.close();
    }
}
