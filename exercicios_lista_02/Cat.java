import java.util.ArrayList;

public class Cat extends Animal {

    public Cat(long id, int age, double weight) {
        super(id, "Whiskers", age, weight, new ArrayList<String>());
        getAbilities().add("agility");
    }

    public String sound() {
        return "meow";
    }
}
