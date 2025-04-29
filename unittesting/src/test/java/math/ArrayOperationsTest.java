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
    private String FILE_PATH;
    @Before
    public void setUp() throws Exception {
        arrayOperations = new ArrayOperations();
        fileIO = new FileIO();
        myMath = new MyMath();
        FILE_PATH = "src/test/resources/prime_test_file.txt";
    }

    @After
    public void tearDown() throws Exception {
        arrayOperations = null;
        fileIO = null;
        myMath = null;
        FILE_PATH = null;
    }

    @Test
    public void findPrimesInFile() {
        int [] expected = {23, 42793, 19, 41, 9851, 9857};
        int [] actual = arrayOperations.findPrimesInFile(fileIO,FILE_PATH, myMath);
        assertArrayEquals(expected, actual);
    }
}