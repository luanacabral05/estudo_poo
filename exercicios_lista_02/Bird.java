import java.util.ArrayList;

public class Bird extends Animal {

    public Bird(long id, int age, double weight) {
        super(id, "Tweety", age, weight, new ArrayList<String>());
        getAbilities().add("fly");
    }

    public String sound() {
        return "piu";
    }
}
