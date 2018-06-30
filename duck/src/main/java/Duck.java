import behavior.FlyBehavior;
import behavior.QuackBehavior;

public abstract class Duck {

    private FlyBehavior flyBehavior;

    private QuackBehavior quackBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public String performFly(){
        return this.flyBehavior.fly();
    }

    public String performQuack(){
        return this.quackBehavior.quack();
    }

    public abstract String display();
}
