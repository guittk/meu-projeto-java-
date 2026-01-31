package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest
{
    @Test
    public void testApp()
	{
        assertTrue(true, "Fazendo alteraçao no arquivo");
    }
    @Test
    public void reverseTestApp()
	{
        assertFalse(false, "This test should always pass false.");
    }
}