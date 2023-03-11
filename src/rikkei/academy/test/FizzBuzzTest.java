package rikkei.academy.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import rikkei.academy.FizzBuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    @DisplayName("Test Fizz 3")
    void testFizz3() {
        int number = 3;
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test Fizz 6")
    void testFizz6() {
        int number = 6;
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test Buzz 5")
    void testFizz5() {
        int number = 5;
        String expected = "Buzz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test Buzz 10")
    void testFizz10() {
        int number = 10;
        String expected = "Buzz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test FizzBuzz 15")
    void testFizz15() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test FizzBuzz 30")
    void testFizz30() {
        int number = 30;
        String expected = "FizzBuzz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test None 7")
    void testFizz7() {
        int number = 7;
        String expected = number + "";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }
}
