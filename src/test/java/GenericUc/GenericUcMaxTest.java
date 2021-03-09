package GenericUc;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GenericUcMaxTest {
    GenericUcMax MaxN;

    @Before
    public void set() throws Exception {
        MaxN = new GenericUcMax();
    }
    @Test
    public void given_MaxNumberat_FirstPosition_Returns_True_Test() {
        int result = MaxN.getIntegerMaximum(30,20,10);
        Assert.assertEquals(30, result);
    }

    @Test
    public void given_MaxNumberat_SecondPosition_Returns_True_Test() {
        int result = MaxN.getIntegerMaximum(20,30,10);
        Assert.assertEquals(30, result);
    }

    @Test
    public void given_MaxNumberat_ThirdPosition_Returns_True_Test() {
        int result = MaxN.getIntegerMaximum(10,20,30);
        Assert.assertEquals(30,result);
    }
    @Test
    public void given_MaxDoubleat_FirstPosition_Returns_True_Test() {
        double result = MaxN.getDoubleMaximum(30.0,20.0,10.0);
        Assert.assertEquals(30.0, result, 0.001);
    }

    @Test
    public void given_MaxDoubleat_SecondPosition_Returns_True_Test() {
        double result = MaxN.getDoubleMaximum(20.0,30.0,10.0);
        Assert.assertEquals(30.0, result,0.001);
    }

    @Test
    public void given_MaxDoubleat_ThirdPosition_Returns_True_Test() {
        double result = MaxN.getDoubleMaximum(10.0,20.0,30.0);
        Assert.assertEquals(30.0,result,0.001);
    }
    @Test
    public void given_MaxStringat_FirstPosition_Returns_True_Test() {
        String result = MaxN.getStringMaximum("Peach", "Banana", "Apple");
        Assert.assertEquals("Peach", result);
    }

    @Test
    public void given_MaxStringat_SecondPosition_Returns_True_Test() {
        String result = MaxN.getStringMaximum("Apple","Peach","Banana");
        Assert.assertEquals("Peach", result);
    }

    @Test
    public void given_MaxStringat_ThirdPosition_Returns_True_Test() {
        String result = MaxN.getStringMaximum("Apple", "Peach", "banana");
        Assert.assertEquals("banana", result);
    }
}