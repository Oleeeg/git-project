package com.gmail.gomiiilko;

import org.junit.Test;

import static com.gmail.gomiiilko.ConsoleApplication.sum;
import static junit.framework.TestCase.assertEquals;

public class ConsoleApplicaiotnTest {
    @Test
    public void shouldReturnSum() {
        int actual = sum(1, 2);
        int expected = 3;
        assertEquals(expected, actual);
    }
}