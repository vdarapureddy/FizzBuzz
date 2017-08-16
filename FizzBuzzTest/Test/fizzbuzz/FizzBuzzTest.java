package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void testMultipleOfThreeOnlyPrintsFizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzzResult(93));
    }

    @Test
    public void testMultipleOfFiveOnlyPrintsBuzz() {
        assertEquals("Buzz", FizzBuzz.fizzBuzzResult(20));
    }

    @Test
    public void testInputOfEightPrintsTheNumber() {
        assertEquals("7", FizzBuzz.fizzBuzzResult(7));
    }


    @Test
    public void testMultipleOfThreeAndFivePrintsFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzzResult(30));
    }

    @Test
    public void testOutputOfProgramIsANonEmptyString() {
        String out = FizzBuzz.fizzBuzzOutput();
        assertNotNull(out);
        assertNotSame(0, out.length());
    }
}
