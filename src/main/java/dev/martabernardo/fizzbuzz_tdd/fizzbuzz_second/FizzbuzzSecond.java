package dev.martabernardo.fizzbuzz_tdd.fizzbuzz_second;

import dev.martabernardo.fizzbuzz_tdd.fizzbuzz.Fizzbuzz;

public class FizzbuzzSecond {
    public String secondCheckNumber(int num) {
        String checkNumberResult = new Fizzbuzz().checkNumber(num);
        boolean contains3=checkNumberResult.contains("3");
        boolean contains5=checkNumberResult.contains("5");
        boolean contains5and3=checkNumberResult.contains("5")&&checkNumberResult.contains("3");

        if(contains5and3) return "Fizzbuzz";
        if(contains3) return "Fizz";
        if(contains5) return "Buzz";
        return checkNumberResult;
    }

}
