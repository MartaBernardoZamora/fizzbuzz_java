package dev.martabernardo.fizzbuzz_tdd.fizzbuzz_second;

import dev.martabernardo.fizzbuzz_tdd.fizzbuzz.Fizzbuzz;

public class FizzbuzzSecond {
    public String secondCheckNumber(int num) {
        String checkNumberResult = new Fizzbuzz().checkNumber(num);
        if(checkNumberResult.contains("3")){
            return "Fizz";
        }
        return checkNumberResult;
    }

}
