package ClassWorks.tdd.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.fail;

public class CalculatorTest {
    private Calculator c;


    @Test
    public void testString(){
        String str1 = "123";
        String str2 = "123";
        Assert.assertSame(str1, str2);

        str1 += 1;
        str2 += 1;
        Assert.assertNotSame(str1, str2);
    }
    @Before
    public void setUp() {
        Calculator c = new Calculator();
    }
    @Test
    public void addTest(){
        c = new Calculator();

        Assert.assertNotNull(c);
        Assert.assertEquals(9, c.add(5, 3), 1);
        Assert.assertTrue(c.add(5,3) == 8);
    }

    @Test (expected = ArithmeticException.class)
    public void subTest(){
        // FIXME: 11.08.17
        c = new Calculator();
        fail();
    }

    @Test
    public void mulTest(){
        // FIXME: 11.08.17
        c = new Calculator();
        fail();
    }

    @Test
    public void divTest(){
        // FIXME: 11.08.17
        c = new Calculator();
        fail();
    }
}
