import com.company.Fizzbuzz.Fizzbuzz;
import org.junit.Assert;
import org.junit.Test;

public class FizzbuzzTest {

    @Test
    public void testFizzBuzz() {
        Assert.assertEquals("FizzBuzz", Fizzbuzz.eval(15));
        Assert.assertEquals("FizzBuzz", Fizzbuzz.eval(30));
    }

    @Test
    public void testFizz() {
        Assert.assertEquals("Fizz", Fizzbuzz.eval(6));
        Assert.assertEquals("Fizz", Fizzbuzz.eval(9));
    }

    @Test
    public void testBuzz() {
        Assert.assertEquals("Buzz", Fizzbuzz.eval(10));
        Assert.assertEquals("Buzz", Fizzbuzz.eval(25));
    }

    @Test
    public void testNumber7() {
        Assert.assertEquals("7", Fizzbuzz.eval(7));
    }

    @Test
    public void testNumber11() {
        Assert.assertEquals("11", Fizzbuzz.eval(11));
    }

}