public class Pessoa {
    int idade;
    String nome;
    String cpf;
    int distancia;

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