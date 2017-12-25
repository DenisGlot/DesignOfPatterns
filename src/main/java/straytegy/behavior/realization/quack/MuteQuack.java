package straytegy.behavior.realization.quack;

import straytegy.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior{

    public void quack() {
        System.out.println("Silence");
    }
}
