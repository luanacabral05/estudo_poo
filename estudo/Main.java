public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.idade = 20;
        p.nome = "fulano";
        p.cpf = "123456";
        p.distancia = 0;

        System.out.println(p.nome + " de cpf " + p.cpf); // trecho cortado na foto
        p.andar(2);
        p.andar(2);
        p.andar(2);

        Pessoa p2 = new Pessoa();
        p2.idade = 18;
        p2.nome = "beltrano";
        p2.cpf = "1111111";

        System.out.println(p2.nome + " de cpf " + p2.cpf);
        p.aniversario();
        System.out.println(p.nome + " de cpf " + p.cpf);
    }
}