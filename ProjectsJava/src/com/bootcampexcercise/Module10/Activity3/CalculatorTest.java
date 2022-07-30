package com.bootcampexcercise.Module10.Activity3;


import com.bootcampexcercise.Module10.Activity3.Calculator;
import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    private Calculator theCalculator;


    protected void setUp() throws Exception {
        super.setUp();
        //	Initialize variables to be used here
        theCalculator = new Calculator();
    }

    protected void tearDown() throws Exception {
        theCalculator = null;
        super.tearDown();
    }

    public void testGetSum() {

        int a = 6;
        int b = 20;

        assertEquals(26, (theCalculator.getSum(a, b)));
        assertEquals(26, (theCalculator.getSum(b, a)));

        a = -6;
        b = 20;

        assertEquals(14, (theCalculator.getSum(a, b)));
        assertEquals(14, (theCalculator.getSum(b, a)));

        a = -6;
        b = -20;

        assertEquals(-26, (theCalculator.getSum(a, b)));
        assertEquals(-26, (theCalculator.getSum(b, a)));
    }

    public void testGetDifference() {

        int a = 4;
        int b = 2;
        //	Checks if b is lesser than a
        assertEquals(2, (theCalculator.getDifference(a, b)));
        //	Checks if b is greater than a
        assertEquals(-2, (theCalculator.getDifference(b, a)));

        a = 6;
        b = -4;
        //	Checks if negative value is subtracted from positive value
        assertEquals(10, (theCalculator.getDifference(a, b)));
        //	Checks if positive value is subtracted from negative value
        assertEquals(-10, (theCalculator.getDifference(b, a)));

        a = -10;
        b = -5;
        //	Checks if negative value is subtracted from negative value: a > b
        assertEquals(-5, (theCalculator.getDifference(a, b)));
        //	Checks if negative value is subtracted from negative value: b < a
        assertEquals(5, (theCalculator.getDifference(b, a)));
    }

    public void testGetProduct() {

        double a = 5;
        double b = 10;
        //	Checks the product of two (2) positive values
        assertEquals(50, (theCalculator.getProduct(a, b)), 0);
        assertEquals(50, (theCalculator.getProduct(b, a)), 0);

        a = -5;
        b = 10;
        //	Checks the product of a postive value and a negative value
        assertEquals(-50, (theCalculator.getProduct(a, b)), 0);
        assertEquals(-50, (theCalculator.getProduct(b, a)), 0);

        a = -3;
        b = -10;
        //	Checks the product of two (2) negative values
        assertEquals(30, (theCalculator.getProduct(a, b)), 0);
        assertEquals(30, (theCalculator.getProduct(b, a)), 0);
    }

    public void testGetQuotient() {

        double a = 16;
        double b = 4;
        //	Checks if b is lesser than a
        assertEquals(4, (theCalculator.getQuotient(a, b)), 0);
        //	Checks if b is greater than a
        assertEquals(0.25, (theCalculator.getQuotient(b, a)), 0);

        a = 9;
        b = -3;
        //	Checks if positive value is divided with negative value
        assertEquals(-3, (theCalculator.getQuotient(a, b)), 0);
        //	Checks if negative value is divided with positive value
        assertEquals(-0.33, (theCalculator.getQuotient(b, a)), 0.007);

        a = -16;
        b = -2;
        //	Checks if negative value is divided with negative value: a > b
        assertEquals(8, (theCalculator.getQuotient(a, b)), 0);
        //	Checks if negative value is divided with negative value: b < a
        assertEquals(0.125, (theCalculator.getQuotient(b, a)), 0);
    }

    public void testThrowException() {

        try {

            theCalculator.getSum(2, 1);
            theCalculator.getDifference(3, 3);
            theCalculator.getProduct(0, 1);
            theCalculator.getQuotient(1, 0);
            new Calculator();

        } catch (Exception e) {
            fail();
        } catch (Error e) {
            fail();
        }

    }
}