package Animal;

public class Chicken implements AnimalBehavior{
    @Override
    public String walk() {
        return "Chicken is walking";
    }

    @Override
    public String talk() {
        return "Chicken is talking";
    }

    @Override
    public String eat() {
        return "Chicken is eating";
    }
}
