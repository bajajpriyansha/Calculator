import org.example.api.calcService;
import org.example.mainProg.Calculate;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatorTest {
    @Test
    public  void addTwoNumbers()
    {
        calcService calculate =mock(calcService.class);
        Calculate cal=new Calculate(calculate);
        int expectedValue=15;
        when(calculate.add(5,10)).thenReturn(expectedValue);
        int actualValue=cal.check("+",5,10);
        Assert.assertEquals(15,actualValue);
    }
    @Test
    public  void subtractTwoNumbers()
    {
        calcService calculate =mock(calcService.class);
        Calculate cal=new Calculate(calculate);
        int expectedValue=-5;
        when(calculate.add(5,10)).thenReturn(expectedValue);
        int actualValue=cal.check("+",5,10);
        Assert.assertEquals(-5,actualValue);
    }
}
