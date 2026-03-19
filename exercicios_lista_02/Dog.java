import java.util.ArrayList;

public class Dog extends Animal {

    public Dog(long id, int age, double weight) {
        super(id, "Buddy", age, weight, new ArrayList<String>());
        getAbilities().add("sniff");
    }

    public String sound() {
        return "au";
    }
}
