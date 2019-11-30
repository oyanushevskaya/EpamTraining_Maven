package com.github.vitalliuss.helloci;

/**
 * Hello CI!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello CI!" );
        double a, b, c, d, sum, sumBC, comAB;
        a = -3.0 / 0;
        b =  3.0 / 0;
        c = 0 / 4.0;
        d = 0 / 0.0;
        sum = a + b + c + d;
        sumBC = b + c;
        comAB = a * b;
        System.out.print(sum + " " + sumBC + " " + comAB);
    }

    public static void doNothing() {
    	// do nothing
    }
}
