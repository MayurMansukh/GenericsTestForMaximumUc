package GenericUc;
import org.junit.Assert;
import org.junit.Test;

public class GenericUcMaxTest {

    @Test
    public void given_integers_check_maximum()
    {
        GenericUcMax<Integer> max=new GenericUcMax<>(20,40,60,80,100);
        int result=max.maximum();
        Assert.assertEquals(100,result);
    }

    @Test
    public void given_float_check_maximum()
    {
        GenericUcMax<Double> max=new GenericUcMax<>(20.00,50.99,80.00,90.9999,10.0);
        double result=max.maximum();
        Assert.assertEquals(90.9999,result,1e-15);
    }

    @Test
    public void given_strings_check_maximum()
    {
        GenericUcMax<String> max=new GenericUcMax<>("Mayur","Mansukh","snjay","Akshay","karan");
        String result=max.maximum();
        Assert.assertEquals("Mansukh",result);
    }

}