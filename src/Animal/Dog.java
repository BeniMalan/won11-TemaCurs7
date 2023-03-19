package Animal;

public class Dog implements AnimalBehavior{
    @Override
    public String walk() {
        return "Dog is walking";
    }

    @Override
    public String talk() {
        return "Dog is talking";
    }

    @Override
    public String eat() {
        return "Dog is eating";
    }
}
