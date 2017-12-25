package straytegy.duck;

import straytegy.behavior.FlyBehavior;
import straytegy.behavior.QuackBehavior;

public abstract class Duck {

    protected  FlyBehavior flyBehavior;

    protected QuackBehavior quackBehavior;

    protected abstract  void  display();

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

}
