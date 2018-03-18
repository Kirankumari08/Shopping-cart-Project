package com.shoppingcart.ShoppingBackEnd;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ShoppingBackEndTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ShoppingBackEndTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ShoppingBackEndTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testShoppingBackEnd()
    {
        assertTrue( true );
    }
}
