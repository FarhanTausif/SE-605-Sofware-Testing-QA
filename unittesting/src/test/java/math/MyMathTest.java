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

    @Test(expected = IllegalArgumentException.class)
    public void test_factorial_if_number_is_negative() {
        myMath.factorial(-2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_factorial_if_number_greater_than_12() {
        myMath.factorial(13);
    }

    @Test
    public void test_factorial_zero() {
        assertEquals(1, myMath.factorial(0));
    }

    @Test
    public void test_factorial_maximum_input() {
        assertEquals(479001600, myMath.factorial(12));
    }

    @Test
    public void test_factorial_mid_range() {
        assertEquals(5040, myMath.factorial(7));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_isPrime_if_number_less_than_2() {
        myMath.isPrime(1);
    }

    @Test
    public void test_isPrime_smallest_prime() {
        assertTrue(myMath.isPrime(2));
    }

    @Test
    public void test_isPrime_small_prime() {
        assertTrue(myMath.isPrime(3));
    }

    @Test
    public void test_isPrime_small_non_prime() {
        assertFalse(myMath.isPrime(4));
    }

    @Test
    public void test_isPrime_large_prime() {
        assertTrue(myMath.isPrime(42793));
    }

    @Test
    public void test_isPrime_large_non_prime() {
        assertFalse(myMath.isPrime(32793));
    }
}