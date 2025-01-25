package dev.martabernardo.fizzbuzz_tdd;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){        
            System.out.println(i);
        }
        System.out.println("Has completado la cuenta de cien");
    }
}
