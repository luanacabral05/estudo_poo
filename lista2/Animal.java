import java.util.ArrayList;

public class Animal {
    private long id;
    private String nome;
    private int idade;
    private double peso;
    private ArrayList<String> habilidades;

    public Animal(long id, String nome, int idade, double peso) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.habilidades = new ArrayList<>();
    }

    public String emitirSom() {
        return "som desconhecido";
    }

    public String realizarHabilidade(String habilidade) {
        if (habilidades.contains(habilidade)) {
            return nome + " consegue " + habilidade;
        }
        return nome + " não consegue " + habilidade;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }
}
