import java.util.ArrayList;
import java.util.Scanner;

class Empregado {
    private String nome;
    private int idade;
    private double salario;
    
    // Construtor
    public Empregado(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    // Método toString
    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                '}';
    }
    
    // Método promover
    public void promover() {
        if (idade > 18) {
            double novoSalario = this.salario * 1.25; // Aumento de 25%
            aumentarSalario(novoSalario);
        } else {
            System.out.println("O empregado não atende aos requisitos para promoção.");
        }
    }
    
    // Método aumentarSalario
    public void aumentarSalario(double percentual) {
        this.salario *= (1 + percentual / 100);
    }
    
    // Método demitir
    public void demitir(int motivo) {
        switch (motivo) {
            case 1: // Justa causa
                System.out.println("Funcionário demitido por justa causa.");
                // Implemente aqui a lógica de aviso prévio, se necessário
                break;
            case 2: // Decisão do empregador
                double multa = this.salario * 0.4;
                this.salario -= multa;
                System.out.println("Funcionário demitido a pedido do empregador. Multa aplicada: " + multa);
                break;
            case 3: // Aposentadoria
                double salarioAposentadoria = calcularSalarioAposentadoria();
                System.out.println("Funcionário aposentado. Salário de aposentadoria: " + salarioAposentadoria);
                break;
            default:
                System.out.println("Motivo inválido.");
        }
    }
    
    // Método para calcular o salário de aposentadoria conforme as regras
    private double calcularSalarioAposentadoria() {
        if (this.salario >= 1000 && this.salario < 2000) {
            return 1500;
        } else if (this.salario >= 2000 && this.salario < 3000) {
            return 2500;
        } else if (this.salario >= 3000 && this.salario < 4000) {
            return 3500;
        } else {
            return 4000;
        }
    }
    
    // Método fazerAniversario
    public void fazerAniversario() {
        this.idade++;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Empregado> listaEmpregados = new ArrayList<>();
        
        int opcao;
        do {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Criar novo empregado");
            System.out.println("2. Promover empregado");
            System.out.println("3. Aumentar salário do empregado");
            System.out.println("4. Demitir empregado");
            System.out.println("5. Fazer aniversário do empregado");
            System.out.println("6. Mostrar detalhes dos empregados");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Nome do empregado: ");
                    String nome = scanner.next();
                    System.out.print("Idade do empregado: ");
                    int idade = scanner.nextInt();
                    System.out.print("Salário do empregado: ");
                    double salario = scanner.nextDouble();
                    Empregado novoEmpregado = new Empregado(nome, idade, salario);
                    listaEmpregados.add(novoEmpregado);
                    break;
                case 2:
                    System.out.println("Lista de empregados:");
                    mostrarEmpregados(listaEmpregados);
                    System.out.print("Escolha o número do empregado a ser promovido: ");
                    int indexPromocao = scanner.nextInt();
                    listaEmpregados.get(indexPromocao).promover();
                    break;
                case 3:
                    System.out.println("Lista de empregados:");
                    mostrarEmpregados(listaEmpregados);
                    System.out.print("Escolha o número do empregado a ter o salário aumentado: ");
                    int indexAumentoSalario = scanner.nextInt();
                    System.out.print("Informe o percentual de aumento de salário: ");
                    double percentual = scanner.nextDouble();
                    listaEmpregados.get(indexAumentoSalario).aumentarSalario(percentual);
                    break;
                case 4:
                    System.out.println("Lista de empregados:");
                    mostrarEmpregados(listaEmpregados);
                    System.out.print("Escolha o número do empregado a ser demitido: ");
                    int indexDemitir = scanner.nextInt();
                    System.out.print("Informe o motivo da demissão (1-Justa causa, 2-Decisão do empregador, 3-Aposentadoria): ");
                    int motivo = scanner.nextInt();
                    listaEmpregados.get(indexDemitir).demitir(motivo);
                    listaEmpregados.remove(indexDemitir);
                    break;
                case 5:
                    System.out.println("Lista de empregados:");
                    mostrarEmpregados(listaEmpregados);
                    System.out.print("Escolha o número do empregado que fará aniversário: ");
                    int indexAniversario = scanner.nextInt();
                    listaEmpregados.get(indexAniversario).fazerAniversario();
                    break;
                case 6:
                    System.out.println("Detalhes dos empregados:");
                    mostrarEmpregados(listaEmpregados);
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 7);
        
        scanner.close();
    }
    
    // Método auxiliar para mostrar os detalhes dos empregados
    private static void mostrarEmpregados(ArrayList<Empregado> listaEmpregados) {
        for (int i = 0; i < listaEmpregados.size(); i++) {
            System.out.println(i + ". " + listaEmpregados.get(i));
        }
    }
}
