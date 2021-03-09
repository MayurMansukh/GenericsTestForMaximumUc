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
}