package nl.soprasteria.jfall.codingchallenge.solution;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestCases {
    @Test
    @DisplayName("Single element sequence has LIS length of 1")
    public void testSingleElement() {
        String output = TestUtil.runTest("5");
        assertEquals(1, Integer.valueOf(output));
    }

    @Test
    @DisplayName("No increasing subsequence")
    public void testNoIncreasingSubsequence() {
        String output = TestUtil.runTest("9 8 7 6 5 4");
        assertEquals(1, Integer.valueOf(output));
    }

    @Test
    @DisplayName("All elements strictly increasing")
    public void testAllIncreasing() {
        String output = TestUtil.runTest("1 2 3 4 5");
        assertEquals(5, Integer.valueOf(output));
    }

    @Test
    @DisplayName("LIS appears in the middle of the sequence")
    public void testLISInMiddle() {
        String output = TestUtil.runTest("5 1 2 3 4 1");
        assertEquals(4, Integer.valueOf(output));
    }

    @Test
    @DisplayName("Example input with complex LIS")
    public void testExampleInput() {
        String output = TestUtil.runTest("10 22 23 9 33 21 50 41 60 80");
        assertEquals(3, Integer.valueOf(output));
    }
}
