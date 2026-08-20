public class Pessoa {
    int idade;
    String nome;
    String cpf;
    int distancia;

    Pessoa(int idade, String nome, String cpf, int distancia){
        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;
        this.distancia = distancia;
    }

    void andar(int d) {
        distancia = distancia + d;
        System.out.println("Andou " + distancia + "Km");
    }

    void dormir() {
        System.out.println("Dormiu");
    }

    void aniversario() {
        idade = idade + 1;
    }
}