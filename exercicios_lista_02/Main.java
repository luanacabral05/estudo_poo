import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Zoo zoo = new Zoo();
        int opcao = 0;

        while (opcao != 6) {
            System.out.println("\n=== Zoologico ===");
            System.out.println("1. Adicionar animal");
            System.out.println("2. Listar todos os animais");
            System.out.println("3. Remover animal (por ID)");
            System.out.println("4. Emitir som de um animal (por ID)");
            System.out.println("5. Testar habilidade de um animal (por ID)");
            System.out.println("6. Sair do programa");
            System.out.print("Escolha uma opcao: ");
            opcao = s.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nTipo do animal:");
                    System.out.println("1. Cat");
                    System.out.println("2. Dog");
                    System.out.println("3. Bird");
                    System.out.print("Escolha: ");
                    int tipo = s.nextInt();

                    System.out.print("ID: ");
                    long id = s.nextLong();
                    System.out.print("Idade: ");
                    int idade = s.nextInt();
                    System.out.print("Peso: ");
                    double peso = s.nextDouble();

                    Animal animal = null;
                    switch (tipo) {
                        case 1:
                            animal = new Cat(id, idade, peso);
                            break;
                        case 2:
                            animal = new Dog(id, idade, peso);
                            break;
                        case 3:
                            animal = new Bird(id, idade, peso);
                            break;
                        default:
                            System.out.println("Tipo invalido!");
                            break;
                    }

                    if (animal != null) {
                        zoo.addAnimal(animal);
                        System.out.println("Animal adicionado com sucesso!");
                    }
                    break;

                case 2:
                    ArrayList<Animal> animais = zoo.listAnimals();
                    if (animais.isEmpty()) {
                        System.out.println("Nenhum animal cadastrado.");
                    } else {
                        for (Animal a : animais) {
                            System.out.println(a.toString());
                        }
                    }
                    break;

                case 3:
                    System.out.print("ID do animal para remover: ");
                    long idRemover = s.nextLong();
                    boolean removido = zoo.removeAnimal(idRemover);
                    System.out.println("Animal removido: " + removido);
                    break;

                case 4:
                    System.out.print("ID do animal: ");
                    long idSom = s.nextLong();
                    Animal animalSom = zoo.findAnimalById(idSom);
                    if (animalSom != null) {
                        System.out.println(animalSom.getName() + " says " + animalSom.sound());
                    } else {
                        System.out.println("Animal nao encontrado.");
                    }
                    break;

                case 5:
                    System.out.print("ID do animal: ");
                    long idHab = s.nextLong();
                    Animal animalHab = zoo.findAnimalById(idHab);
                    if (animalHab != null) {
                        s.nextLine(); // limpar buffer
                        System.out.print("Habilidade para testar: ");
                        String habilidade = s.nextLine();
                        System.out.println(animalHab.performAbility(habilidade));
                    } else {
                        System.out.println("Animal nao encontrado.");
                    }
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }

        s.close();
    }
}
