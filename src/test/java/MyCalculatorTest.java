import org.junit.Before;
import org.junit.Test;

/**
 * Verify the correctness of calculator.MyCalculator.
 */
public class MyCalculatorTest {

    private MyCalculator calculator;

    @Before
    public void setUp() {
        calculator = new MyCalculator();
    }

    @Test
    public void sumTest() {
        int a = 2, b = 2;
        assert calculator.sum(a, b)==(a+b);
    }

    @Test
    public void subtractTest() {
        int a = 2, b = 2;
        assert calculator.subtract(a, b)==(a-b);
    }

    @Test
    public void divideTest() {
        int a = 2, b = 3;
        assert calculator.divide(a, b)==(((double)a)/b);
    }

    @Test
    public void multiplyTest() {
        int a = 2, b = 2;
        assert calculator.multilply(a, b)==(a*b);
    }

}
