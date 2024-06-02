
class Namekuseijin extends PersonagemDragonBall {
    private int quantidadeEsferas;
    private boolean podeCurar;

    public Namekuseijin(String nome, int idade, String sexo, String temporada, int ki, String poderEspecial, int quantidadeEsferas, boolean podeCurar) {
        super(nome, idade, sexo, temporada, ki, poderEspecial);
        this.quantidadeEsferas = quantidadeEsferas;
        this.podeCurar = podeCurar;
    }

    @Override
    public int calcularPoder() {
        return (int) (ki * (1 + (podeCurar ? 0.2 : 0)));
    }

    public String fazerDesejo(String desejo) {
        return "Desejo em Namekusei: " + desejo.replaceAll("a", "na").replaceAll("e", "ne").replaceAll("i", "ni").replaceAll("o", "no").replaceAll("u", "nu");
    }

    @Override
    public String toString() {
        return String.format("Namekuseijin [nome=%s, idade=%d, sexo=%s, temporada=%s, ki=%d, poderEspecial=%s, quantidadeEsferas=%d, podeCurar=%b]",
                nome, idade, sexo, temporada, ki, poderEspecial, quantidadeEsferas, podeCurar);
    }
}