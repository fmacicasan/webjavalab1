import org.junit.Assert;
import org.junit.Test;
import test1.Calc;

/**
 * @author flo
 * @since 24/10/2017.
 */
public class CalcTest {

    @Test
    public void testCalculator() {

        Calc calculatoruMeu = new Calc();

        int result = calculatoruMeu.add(10, 15);

        Assert.assertEquals("Expected to sum the inputs", 25, result);

    }
}
