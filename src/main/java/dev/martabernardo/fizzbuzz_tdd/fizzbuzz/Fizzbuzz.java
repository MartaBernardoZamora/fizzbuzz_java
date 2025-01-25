package dev.martabernardo.fizzbuzz_tdd.fizzbuzz;

public class Fizzbuzz {

    public String checkNumber(int num) {
        boolean isDivisibleBy3 = num % 3 == 0;
        boolean isDivisibleBy5 = num % 5 == 0;
        boolean isDivisibleBy15 = num % 15 == 0;

        if(isDivisibleBy15) return "FizzBuzz";
        if(isDivisibleBy3) return "Fizz";
        if(isDivisibleBy5) return "Buzz";
        return "null";
    }

}
