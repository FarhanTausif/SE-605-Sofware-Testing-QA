package io;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class FileIOTest {
    private FileIO fileIO;
    private String NULL_FILE_PATH;
    private String INVALID_FILE_PATH;
    private String EMPTY_FILE_PATH;

    private String VALID_FILE_PATH;
    @Before
    public void setUp() throws Exception {
        fileIO = new FileIO();
        NULL_FILE_PATH = "src/test/resources/null_file.txt";
        INVALID_FILE_PATH = "src/test/resources/invalid_test_file.txt";
        EMPTY_FILE_PATH = "src/test/resources/empty_file.txt";
        VALID_FILE_PATH = "src/test/resources/valid_test_file.txt";
    }

    @After
    public void tearDown() throws Exception {
        fileIO = null;
        NULL_FILE_PATH = null;
        INVALID_FILE_PATH = null;
        EMPTY_FILE_PATH = null;
        VALID_FILE_PATH = null;
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_readFile_when_file_does_not_exist() {
        fileIO.readFile(NULL_FILE_PATH);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_readFile_when_file_is_empty() {
        fileIO.readFile(EMPTY_FILE_PATH);
    }

    @Test (expected = NumberFormatException.class)
    public void test_readFile_if_file_is_invalid(){
        fileIO.readFile(INVALID_FILE_PATH);
    }

    @Test
    public void test_readFile(){
        int [] expected = {10, 2, 5, 6, 9, 4, 5, 2, 2, 1};
        int [] actual = fileIO.readFile(VALID_FILE_PATH);
        assertArrayEquals(expected, actual);
    }
}