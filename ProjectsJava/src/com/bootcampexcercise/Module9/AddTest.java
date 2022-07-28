package com.bootcampexcercise.Module9;

import junit.framework.TestCase;

public class AddTest extends TestCase {

    private AddClass addClass;

    protected void setUp() throws Exception {
        super.setUp();
        //	Initialize variables to be used here
        addClass = new AddClass();
    }

    protected void tearDown() throws Exception {
        addClass = null;
        super.tearDown();
    }

    public void testAdd() {
        assertEquals("Result didn't match the expected output", 16, addClass.add(8, 8));
    }
}
