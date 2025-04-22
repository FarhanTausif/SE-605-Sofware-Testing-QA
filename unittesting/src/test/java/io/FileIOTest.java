package io;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class FileIOTest {
    private FileIO fileIO;
    @Before
    public void setUp() throws Exception {
        fileIO = new FileIO();
    }

    @After
    public void tearDown() throws Exception {
        fileIO = null;
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_readFile_when_file_does_not_exist() {
        fileIO.readFile("D:\\Semester 6\\Testing-QA-lab\\unittesting\\src\\test\\resources\\null_file.txt");
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_readFile_when_file_is_empty() {
        fileIO.readFile("D:\\Semester 6\\Testing-QA-lab\\unittesting\\src\\test\\resources\\empty_file.txt");
    }

    @Test (expected = NumberFormatException.class)
    public void test_readFile_if_file_is_invalid(){
        fileIO.readFile("D:\\Semester 6\\Testing-QA-lab\\unittesting\\src\\test\\resources\\invalid_test_file.txt");
    }

    @Test
    public void test_readFile(){
        int [] expected = {10, 2, 5, 6, 9, 4, 5, 2, 2, 1};
        int [] actual = fileIO.readFile("D:\\Semester 6\\Testing-QA-lab\\unittesting\\src\\test\\resources\\valid_test_file.txt");
        assertArrayEquals(expected, actual);
    }
}