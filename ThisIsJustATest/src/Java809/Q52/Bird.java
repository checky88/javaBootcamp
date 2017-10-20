package Java809.Q52;

import java.util.function.Supplier;

/**
 * Created by KellyR on 19/10/2017.
 */
class Bird {
    public void fly() {
        System.out.print("Can fly");
    }
}
class Penguin extends Bird {
    public void fly() {
        System.out.print("Cannot fly");
    }
}

class Birdie {

    public static void main(String[] args) {
        fly(() -> new Bird());
        fly(Penguin::new);
    }
    /* line n1 */
    static void fly (Supplier<Bird> bird) {
        bird.get().fly();
    }
}