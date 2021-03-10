package GenericUc;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GenericUcMaxTest {

    @Test
    public void given_MaxNumberat_FirstPosition_Returns_True_Test() {
        int result = (int)new GenericUcMax(30,20,10).maximum();
        Assert.assertEquals(30, result);
    }

    @Test
    public void given_MaxNumberat_SecondPosition_Returns_True_Test() {
        int result =(int) new GenericUcMax(20,30,10).maximum();
        Assert.assertEquals(30, result);
    }

    @Test
    public void given_MaxNumberat_ThirdPosition_Returns_True_Test() {
        int result = (int) new GenericUcMax(10,20,30).maximum();
        Assert.assertEquals(30,result);
    }
    @Test
    public void given_MaxDoubleat_FirstPosition_Returns_True_Test() {
        double result = (double) new GenericUcMax(30.0,20.0,10.0).maximum();
        Assert.assertEquals(30.0, result, 0.001);
    }

    @Test
    public void given_MaxDoubleat_SecondPosition_Returns_True_Test() {
        double result = (double) new GenericUcMax(20.0,30.0,10.0).maximum();
        Assert.assertEquals(30.0, result,0.001);
    }

    @Test
    public void given_MaxDoubleat_ThirdPosition_Returns_True_Test() {
        double result = (double) new GenericUcMax(10.0,20.0,30.0).maximum();
        Assert.assertEquals(30.0,result,0.001);
    }
    @Test
    public void given_MaxStringat_FirstPosition_Returns_True_Test() {
        String result = (String) new GenericUcMax("Peach", "Banana", "Apple").maximum();
        Assert.assertEquals("Peach", result);
    }

    @Test
    public void given_MaxStringat_SecondPosition_Returns_True_Test() {
        String result =(String) new GenericUcMax("Apple","Peach","Banana").maximum();
        Assert.assertEquals("Peach", result);
    }

    @Test
    public void given_MaxStringat_ThirdPosition_Returns_True_Test() {
        String result = (String) new GenericUcMax("Apple", "Peach", "banana").maximum();
        Assert.assertEquals("banana", result);
    }
}