package math;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyMathTest {

    private MyMath myMath;
    @Before
    public void setUp() throws Exception {
        myMath = new MyMath();
    }

    @After
    public void tearDown() throws Exception {
        myMath = null;
    }

    @Test (expected = IllegalArgumentException.class)
    public void test_factorial_if_number_is_negative() {
        myMath.factorial(-2);
    }
    @Test (expected = IllegalArgumentException.class)
    public void test_factorial_if_number_greater_than_12() {
        myMath.factorial(13);
    }
    @Test
    public void factorial() {
        assertEquals(5040, myMath.factorial(7));
    }

    @Test (expected = IllegalArgumentException.class)
    public void test_isPrime_if_number_less_than_2() {
        myMath.isPrime(1);
    }
    @Test
    public void isPrime_true() {
        assertTrue(myMath.isPrime(42793));
    }

    @Test
    public void isPrime_false() {
        assertFalse(myMath.isPrime(32793));
    }
}