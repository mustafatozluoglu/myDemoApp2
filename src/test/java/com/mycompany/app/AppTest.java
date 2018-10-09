package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testMatch() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

      assertTrue(new App().search(array, array2, 0, 0));
    }

    public void testNotMatch() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

      assertFalse(new App().search(array, array2, 0, 1));
    }

    public void testEmptyArray1() {
      ArrayList<Integer> array = new ArrayList<>();
      ArrayList<Integer> array2 = new ArrayList<>();

      assertFalse(new App().search(array, array2, 1, 1));
    }
    public void testEmptyArray2() {
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();

        assertFalse(new App().search(array, array2, 1, 1));
    }

    public void testNull() {
      assertFalse(new App().search(null, null, 1, 1));
    }

}
