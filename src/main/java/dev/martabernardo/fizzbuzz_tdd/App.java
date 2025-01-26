package dev.martabernardo.fizzbuzz_tdd;

import dev.martabernardo.fizzbuzz_tdd.fizzbuzz.Fizzbuzz;
import dev.martabernardo.fizzbuzz_tdd.fizzbuzz_second.FizzbuzzSecond;

public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        for(int i = 1; i <= 100; i++){
            String result = fizzbuzz.checkNumber(i);
            System.out.println(result);
        }
        System.out.println("Has completado la primera etapa del Fizzbuzz");
        FizzbuzzSecond fizzbuzzSecond=new FizzbuzzSecond();
        for(int i = 1; i <= 100; i++){
            String result = fizzbuzzSecond.secondCheckNumber(i);
            System.out.println(result);
        }
        System.out.println("Has completado la segunda etapa del Fizzbuzz");
    }
}
