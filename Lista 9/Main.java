/*Implemente a classe abstrata PersonagemDragonBall, que deverá ter os seguintes atributos: nome, idade, sexo, temporada, ki, poderEspecial e um método abstrato calcularPoder().


Crie uma interface Transformavel com o método transformar(int nivel).


Crie três novas classes que herdam da classe PersonagemDragonBall:


Terraqueo:


Atributos: pais, cidade
Métodos:
Implementação do método toString().
Implementação do método abstrato calcularPoder(), que deve retornar o poder total calculado como ki.
Sayajin:


Atributos: nivelMaximoSSJ, temRabo
Métodos:
Implementação do método toString().
Implementação dos métodos abstratos:
calcularPoder(): retorna o poder total calculado como ki * (1 + nivelMaximoSSJ * 0.1).
Implementação do método da interface Transformavel.	
Regras de transformação:
Qualquer Sayajin pode se transformar nos níveis 1, 2, 3.
Somente os Sayajins com nome Goku ou Vegeta podem se transformar nos níveis 4 ou 5.
A saída do método deve ser:
"{{ PERSONAGEM }} transformou para super sayajin nível {{ NIVEL }}" ou "Não foi possível transformar esse sayajin"
Namekuseijin:


Atributos: quantidadeEsferas, podeCurar
Métodos:
Implementação do método toString().
Implementação do método abstrato calcularPoder(), que deve retornar o poder total calculado como ki * (1 + (podeCurar ? 0.2 : 0)).
fazerDesejo(String desejo): Recebe um pedido e transforma o pedido para o idioma Namekusei (crie uma associação de palavras livremente) e retorna o desejo no idioma Namekusei.


Crie uma classe estática PersonagemFactory para instanciar os personagens: Kuririn, Goku, Gohan e Dendê.


Evolua o Goku para Super Sayajin 5. 


Evolua o Gohan para Super Sayajin 5 e, se não for possível, evolua para nível 3. 


Utilize o Dendê para fazer um pedido para as esferas do dragão.
 */

public class Main {
    public static void main(String[] args) {
        Sayajin goku = PersonagemFactory.criarGoku();
        goku.transformar(5);

        Sayajin gohan = PersonagemFactory.criarGohan();
        gohan.transformar(5);
        gohan.transformar(3);

        Namekuseijin dende = PersonagemFactory.criarDende();
        String desejo = dende.fazerDesejo("Quero ser forte");
        System.out.println(desejo);
    }
}