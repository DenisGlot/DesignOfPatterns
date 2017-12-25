package straytegy.behavior.realization.fly;

import straytegy.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
