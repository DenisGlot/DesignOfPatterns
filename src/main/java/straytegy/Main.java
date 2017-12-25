package straytegy;

import straytegy.behavior.realization.quack.MuteQuack;
import straytegy.duck.Duck;
import straytegy.duck.extention.MallardDuck;

import java.util.Observable;

public class Main {

    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.setQuackBehavior(new MuteQuack());
        mallard.performQuack();
    }

}
