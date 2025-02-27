package dev.martabernardo.fizzbuzz_tdd.fizzbuzz;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FizzbuzzTest {

    @Test
    @DisplayName("Devuelve fizz si es divisible entre tres")
    void testIsDivisibleByThree() {
        int num = 3;
        Fizzbuzz fizzbuzz = new Fizzbuzz();

        String result = fizzbuzz.checkNumber(num);

        assertThat(fizzbuzz, instanceOf(Fizzbuzz.class));
        assertThat(result, is("Fizz"));
    }
    @Test
    @DisplayName("Devuelve fizz si es divisible entre cinco")
    void testIsDivisibleByFive() {
        int num = 5;
        Fizzbuzz fizzbuzz = new Fizzbuzz();

        String result = fizzbuzz.checkNumber(num);

        assertThat(result, is("Buzz"));
    }
    @Test
    @DisplayName("Devuelve fizz si es divisible entre cinco y tres, que es entre 15")
    void testIsDivisibleByThreeAndFive() {
        int num = 15;
        Fizzbuzz fizzbuzz = new Fizzbuzz();

        String result = fizzbuzz.checkNumber(num);

        assertThat(result, is("FizzBuzz"));
    }
    @Test
    @DisplayName("Devuelve el número si no es divisible entre 3 ni 5")
    void testNotIsDivisibleByThreeOrFive() {
        int num = 1;
        Fizzbuzz fizzbuzz = new Fizzbuzz();

        String result = fizzbuzz.checkNumber(num);

        assertThat(result, is("1"));
    }
}
