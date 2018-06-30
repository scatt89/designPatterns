import behavior.FlyWithWings;
import behavior.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        super(new FlyWithWings(), new Quack());
    }

    public String display() {
        return "mallard duck";
    }
}
