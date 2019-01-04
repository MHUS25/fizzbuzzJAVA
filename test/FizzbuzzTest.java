import com.company.Fizzbuzz.Fizzbuzz;
import org.junit.Assert;
import org.junit.Test;

public class FizzbuzzTest {

    @Test
    public void testFizzBuzz() {
        Assert.assertEquals("FizzBuzz", Fizzbuzz.eval(15));
        Assert.assertEquals("FizzBuzz", Fizzbuzz.eval(30));
    }

}