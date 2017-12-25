package straytegy.duck.extention;

import straytegy.behavior.realization.fly.FlyWithWings;
import straytegy.behavior.realization.quack.Squeak;
import straytegy.duck.Duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squeak();
    }

    protected void display() {
        System.out.println("I am mallard duck");
    }

}
