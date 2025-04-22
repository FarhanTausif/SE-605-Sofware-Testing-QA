package math;

import io.FileIO;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class ArrayOperationsTest {
    private ArrayOperations arrayOperations;
    private FileIO fileIO;
    private MyMath myMath;
    @Before
    public void setUp() throws Exception {
        arrayOperations = new ArrayOperations();
        fileIO = new FileIO();
        myMath = new MyMath();
    }

    @After
    public void tearDown() throws Exception {
        arrayOperations = null;
        fileIO = null;
        myMath = null;
    }

    @Test
    public void findPrimesInFile() {
        int [] expected = {23, 42793, 19, 41, 9851, 9857};
        int [] actual = arrayOperations.findPrimesInFile(fileIO,"D:\\Semester 6\\Testing-QA-lab\\unittesting\\src\\test\\resources\\prime_test_file.txt", myMath);
        assertArrayEquals(expected, actual);
    }
}