import java.util.ArrayList;

public class Locadora {
    private String nome;
    private ArrayList<Filme> filmes;

    public Locadora(String nome) {
        this.nome = nome;
        this.filmes = new ArrayList<Filme>();
    }

    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }

    public void listarFilmes() {
        for (Filme filme : filmes) {
            System.out.println(filme.toString());
            System.out.println("---");
        }
    }
}
