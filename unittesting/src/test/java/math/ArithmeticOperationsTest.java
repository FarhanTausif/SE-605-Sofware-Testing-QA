package math;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArithmeticOperationsTest {
    
    private ArithmeticOperations arithmeticOperations;
    @Before
    public void setUp() throws Exception {
        arithmeticOperations = new ArithmeticOperations();
    }

    @After
    public void tearDown() throws Exception {
        arithmeticOperations = null;
    }


    @Test
    public void divide() {
        double expected = 3.0;
        double actual = arithmeticOperations.divide(15,5);
        assertEquals(expected, actual, 1e-3);
    }

    @Test(expected = ArithmeticException.class)
    public void test_divide_throws_arithmetic_exception() {
        arithmeticOperations.divide(2,0);
    }

    @Test
    public void multiply() {
        double expected = 35.0;
        double actual = arithmeticOperations.multiply(7,5);
        assertEquals(expected, actual, 1e-3);
    }

    @Test (expected = IllegalArgumentException.class)
    public void test_multiply_throws_illegalArgumentException_when_first_number_neg() {
        arithmeticOperations.multiply(-2, 5);
    }

    @Test (expected = IllegalArgumentException.class)
    public void test_multiply_throws_illegalArgumentException_when_second_number_neg() {
        arithmeticOperations.multiply(2, -5);
    }

    @Test (expected = IllegalArgumentException.class)
    public void test_multiply_throws_illegalArgumentException_when_both_numbers_neg() {
        arithmeticOperations.multiply(-2, -5);
    }

    @Test (expected = IllegalArgumentException.class)
    public void test_multiply_throws_illegalArgumentException_when_product_variable_notInt() {
        arithmeticOperations.multiply(0x7fffffff, 500000000);
    }
}