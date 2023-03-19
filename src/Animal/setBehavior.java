package Animal;

public class setBehavior {
    private AnimalBehavior behavior;
    public void behave(AnimalBehavior behavior){
        this.behavior=behavior;
    }
    public void actions(){
        System.out.println(behavior.walk());
        System.out.println(behavior.talk());
        System.out.println(behavior.eat());

    }
}
