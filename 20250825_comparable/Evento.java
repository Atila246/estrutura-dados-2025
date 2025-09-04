public class Evento implements Comparable<Evento> {
    String nome;
    String descricao;
    String linkInscricao;

    public Evento(String nome, String descricao, String linkInscricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.linkInscricao = linkInscricao;
    }

    @Override
    public int compareTo(Evento outro) {
        // Vamos comparar pelo nome do evento (ordem alfabética, ignorando maiúsculas/minúsculas)
        return this.nome.compareToIgnoreCase(outro.nome);
    }

    @Override
    public String toString() {
        return "Evento: " + this.nome + " - " + this.descricao + " (" + this.linkInscricao + ")\n";
    }
}
