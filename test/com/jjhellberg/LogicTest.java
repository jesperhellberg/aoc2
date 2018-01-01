package com.jjhellberg;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LogicTest {
    private static final String TESTINPUT = "5\t1\t9\t5\n" +
            "7\t5\t3\n" +
            "2\t4\t6\t8";

    private static final String TESTINPUT2 = "5\t9\t2\t8\n" +
            "9\t4\t7\t3\n" +
            "3\t8\t6\t5";


    private Logic logic = new Logic();


    @Test
    void testChecksum() {
        assertEquals(18, logic.getChecksumPart1(TESTINPUT));
    }

    @Test
    void testChecksum2() {
        assertEquals(9, logic.getChecksumPart2(TESTINPUT2));
    }
}