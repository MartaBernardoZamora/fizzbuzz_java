package dev.martabernardo.fizzbuzz_tdd.fizzbuzz;

public class Fizzbuzz {

    public String checkNumber(int num) {
        boolean isDivisibleBy3 = num % 3 == 0;
        if(isDivisibleBy3) return "Fizz";
        return "null";
    }

}
