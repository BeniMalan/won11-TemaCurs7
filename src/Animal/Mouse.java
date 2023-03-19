package Animal;

public class Mouse implements AnimalBehavior{
    @Override
    public String walk() {
        return "Mouse is walking";
    }

    @Override
    public String talk() {
        return "Mouse is talking";
    }

    @Override
    public String eat() {
        return "Mouse is eating";
    }
}
