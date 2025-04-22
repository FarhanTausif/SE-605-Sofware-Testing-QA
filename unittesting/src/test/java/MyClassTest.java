import math.ArithmeticOperations;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyClassTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void divide() {
        float expected = 2.0F;
        float actual = (new MyClass()).divide(10,5);

        assertEquals(expected, actual, 1e-3);
    }

    @Test(expected = ArithmeticException.class)
    public void test_divided_by_zero_using_test_annotation(){
        new MyClass().divide(5,0);
    }

    @org.junit.Test
    public void test_divided_by_zero_using_assert(){
        assertThrows(ArithmeticException.class, ()-> {
            new MyClass().divide(5,0);
        });
    }

    @Test
    public void myFunc() {
        assertEquals(2, new MyClass().myFunc(2));
    }

    @Test
    public void myFunc2() {
        assertEquals(-2, new MyClass().myFunc(-2));
    }
}