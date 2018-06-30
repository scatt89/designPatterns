import org.junit.Assert;
import org.junit.Test;

public class DuckTest {

    @Test
    public void MallardDuckTest(){
        Duck mallardDuck = new MallardDuck();
        Assert.assertEquals("quack quack", mallardDuck.performQuack());
        Assert.assertEquals("flying with wings", mallardDuck.performFly());


    }


}
