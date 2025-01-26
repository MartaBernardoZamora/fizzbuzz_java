package dev.martabernardo.fizzbuzz_tdd.fizzbuzz_second;

import dev.martabernardo.fizzbuzz_tdd.fizzbuzz.Fizzbuzz;

public class FizzbuzzSecond {
    public String secondCheckNumber(int num) {
        String checkNumberResult = new Fizzbuzz().checkNumber(num);
        boolean contains3=checkNumberResult.contains("3");
        
        if(contains3) return "Fizz";

        return checkNumberResult;
    }

}
