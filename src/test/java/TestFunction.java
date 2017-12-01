import function.IntegerFunction;
import function.StringFunction;
import org.junit.Assert;
import org.junit.Test;

public class TestFunction {

    @Test
    public void testIntegerFanction(){
        IntegerFunction integerFanction = new IntegerFunction(6,4);

        Assert.assertTrue(integerFanction.action_0()==10);

        Assert.assertTrue(integerFanction.action_1()==2);

        Assert.assertTrue(integerFanction.action_2()==24);

        Assert.assertTrue(integerFanction.action_3()==1);

    }

    public void testStringFunction(){
        StringFunction stringFunction = new StringFunction("6","4");

        Assert.assertTrue(stringFunction.action_0().equals("64"));
    }

}
