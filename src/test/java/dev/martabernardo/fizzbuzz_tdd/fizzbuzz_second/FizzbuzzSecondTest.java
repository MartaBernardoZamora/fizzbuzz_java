package dev.martabernardo.fizzbuzz_tdd.fizzbuzz_second;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FizzbuzzSecondTest {    
    @Test
    @DisplayName("Return fizz if number contains 3")
    void testNumberContains3() {
        int num = 13;
        FizzbuzzSecond fizzbuzzSecond = new FizzbuzzSecond();
        String result = fizzbuzzSecond.secondCheckNumber(num);
        assertThat(result, is("Fizz"));
    }

}
