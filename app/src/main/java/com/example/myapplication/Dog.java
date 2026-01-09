import java.util.Date;

public class Dog extends Pet implements Pettable {

    public Dog(String name) {
        super(name);
    }

    public Dog(String name, Date birthDate) {
        super(name, birthDate);
    }


    public String speak() {
        return "bark";
    }

    public void pet() {
        System.out.println("The dog wags its tail happily.");
    }
}