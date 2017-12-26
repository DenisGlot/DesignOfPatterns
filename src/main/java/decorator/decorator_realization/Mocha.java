package decorator.decorator_realization;

import decorator.Beverage;
import decorator.Decorator;

public class Mocha extends Decorator {

    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }


}
