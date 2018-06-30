import behavior.FlyWithWings;
import behavior.QuackDemon;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        super(new FlyWithWings(), new QuackDemon());
    }

    public String display() {
        return "read head duck";
    }
}
