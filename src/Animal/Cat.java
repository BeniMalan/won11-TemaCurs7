package Animal;

public class Cat implements AnimalBehavior {
    @Override
    public String walk() {
        return "cat is walking";
    }

    @Override
    public String talk() {
        return "Cat is talking";
    }

    @Override
    public String eat() {
        return "Cat is eating";
    }
}
