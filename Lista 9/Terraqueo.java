class Terraqueo extends PersonagemDragonBall {
    private String pais;
    private String cidade;

    public Terraqueo(String nome, int idade, String sexo, String temporada, int ki, String poderEspecial, String pais, String cidade) {
        super(nome, idade, sexo, temporada, ki, poderEspecial);
        this.pais = pais;
        this.cidade = cidade;
    }

    @Override
    public int calcularPoder() {
        return ki;
    }

    @Override
    public String toString() {
        return String.format("Terraqueo [nome=%s, idade=%d, sexo=%s, temporada=%s, ki=%d, poderEspecial=%s, pais=%s, cidade=%s]",
                nome, idade, sexo, temporada, ki, poderEspecial, pais, cidade);
    }
}