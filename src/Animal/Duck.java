package Animal;

public class Duck implements AnimalBehavior{
    @Override
    public String walk() {
        return "Duck is walking";
    }

    @Override
    public String talk() {
        return "Duck is talking";
    }

    @Override
    public String eat() {
        return "Duck is eating";
    }
}
