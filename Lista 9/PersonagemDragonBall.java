abstract class PersonagemDragonBall {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected String temporada;
    protected int ki;
    protected String poderEspecial;

    public PersonagemDragonBall(String nome, int idade, String sexo, String temporada, int ki, String poderEspecial) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.temporada = temporada;
        this.ki = ki;
        this.poderEspecial = poderEspecial;
    }

    public abstract int calcularPoder();
}

