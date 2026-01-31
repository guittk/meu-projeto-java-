package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp()
    {
        assertTrue( true );
    }

    @Test
    public void reverseTestApp()
    {
        assertFalse( false );
    }

    @Test
    public void testSum() {
        App app = new App();
        assertEquals(5, app.sum(2, 3));
    }
}
