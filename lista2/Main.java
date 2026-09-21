import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Zoologico zoologico = new Zoologico();
        int opcao;

        do {
            System.out.println("1. Adicionar animal");
            System.out.println("2. Listar todos os animais");
            System.out.println("3. Remover animal");
            System.out.println("4. Emitir som de um animal");
            System.out.println("5. Testar habilidade de um animal");
            System.out.println("6. Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("1. Gato");
                    System.out.println("2. Cachorro");
                    System.out.println("3. Passaro");
                    System.out.print("Tipo: ");
                    int tipo = sc.nextInt();

                    System.out.print("ID: ");
                    long id = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    System.out.print("Peso: ");
                    double peso = sc.nextDouble();

                    Animal animal = null;
                    if (tipo == 1) {
                        animal = new Gato(id, nome, idade, peso);
                    } else if (tipo == 2) {
                        animal = new Cachorro(id, nome, idade, peso);
                    } else if (tipo == 3) {
                        animal = new Passaro(id, nome, idade, peso);
                    }

                    if (animal == null) {
                        System.out.println("Tipo inválido");
                    } else if (zoologico.adicionarAnimal(animal)) {
                        System.out.println("Animal adicionado");
                    } else {
                        System.out.println("Já existe um animal com esse ID");
                    }
                    break;

                case 2:
                    for (Animal a : zoologico.listarAnimais()) {
                        System.out.println(a.getId() + " - " + a.getNome() + " - " + a.getIdade() + " anos - " + a.getPeso() + " kg");
                    }
                    break;

                case 3:
                    System.out.print("ID do animal: ");
                    long idRemover = sc.nextLong();
                    System.out.println("Animal removido: " + zoologico.removerAnimal(idRemover));
                    break;

                case 4:
                    System.out.print("ID do animal: ");
                    long idSom = sc.nextLong();
                    Animal animalSom = zoologico.buscarAnimal(idSom);
                    if (animalSom != null) {
                        System.out.println(animalSom.getNome() + " diz " + animalSom.emitirSom());
                    } else {
                        System.out.println("Animal não encontrado");
                    }
                    break;

                case 5:
                    System.out.print("ID do animal: ");
                    long idHabilidade = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Habilidade: ");
                    String habilidade = sc.nextLine();
                    Animal animalHabilidade = zoologico.buscarAnimal(idHabilidade);
                    if (animalHabilidade != null) {
                        System.out.println(animalHabilidade.realizarHabilidade(habilidade));
                    } else {
                        System.out.println("Animal não encontrado");
                    }
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 6);

        sc.close();
    }
}
