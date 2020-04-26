package decorator;

import components.Beverage;

public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();
}
