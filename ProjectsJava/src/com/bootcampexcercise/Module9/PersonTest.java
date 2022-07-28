package com.bootcampexcercise.Module9;

import com.bootcampexcercise.Module9.Person;
import junit.framework.TestCase;

public class PersonTest extends TestCase {

    private Person person;

    //TODO: create set up
    protected void setUp() throws Exception {
        super.setUp();
        person = new Person();
    }

    //TODO: create teardown
    protected void tearDown() throws Exception {
        person = null;
        super.tearDown();
    }

    //TODO: create unit tests for getters and setters
    public void testSetAndGetWeight() {
        //regular weight
        int testWeight1 = 59;
        person.setWeight(testWeight1);
        assertEquals(testWeight1, person.getWeight());

        //negative weight
        int testWeight2 = -14;
        person.setWeight(testWeight2);
        assertEquals(testWeight2, person.getWeight());

        //exceeds weight limit
        int testWeight3 = 210;
        person.setWeight(testWeight3);
        assertEquals(testWeight3, person.getWeight());
    }
    public void testSetAndGetHeight(){
        //regular height
        float testHeight = 175;
        person.setHeight(testHeight);
        assertEquals(testHeight, person.getHeight());

        // negative height
        float testHeight2 = -14;
        person.setHeight(testHeight2);
        assertEquals(testHeight2, person.getHeight());

        //exceeds height limit
        float testHeight3 = 210;
        person.setHeight(testHeight3);
        assertEquals(testHeight3, person.getHeight());
    }


    //TODO: create unit test for getBodyMassIndex method

    public void testGetBodyMassIndex(){
        //Standard testing
        int a = 59;
        float b = 175;
        double bmi1 = a / (b*b);
        assertEquals(bmi1, person.getBodyMassIndex(a,b));

        //with a negative number
        int a2 = -59;
        float b2 = -175;
        double bmi = 0.0;
        assertEquals(bmi, person.getBodyMassIndex(a2,b2));

        //when exceeded limit
        int a3 = 210;
        float b3 = 210;
        assertEquals(bmi, person.getBodyMassIndex(a3,b3));
    }

}
