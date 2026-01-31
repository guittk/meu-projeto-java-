package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App app = new App();
        System.out.println("2 + 3 = " + app.sum(2, 3));
    }

    public int sum(int a, int b) {
        return a + b;
    }
}
