package Questao01;

public class Agenda {
    private Compromisso[][] compromissos;

    public Agenda() {
        compromissos = new Compromisso[31][24]; // 31 dias, 24 horas por dia
    }

    public void adicionarCompromisso(int dia, int hora, String descricao) {
        if (dia < 1 || dia > 31 || hora < 0 || hora > 23) {
            System.out.println("Dia ou hora inválidos.");
            return;
        }
        compromissos[dia - 1][hora] = new Compromisso(descricao);
        System.out.println("Compromisso adicionado com sucesso!");
    }

    public String consultarCompromisso(int dia, int hora) {
        if (dia < 1 || dia > 31 || hora < 0 || hora > 23) {
            return "Dia ou hora inválidos.";
        }
        Compromisso compromisso = compromissos[dia - 1][hora];
        return (compromisso != null) ? compromisso.getDescricao() : "Nenhum compromisso agendado.";
    }
}
