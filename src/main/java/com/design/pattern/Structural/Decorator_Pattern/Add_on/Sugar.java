package com.design.pattern.Structural.Decorator_Pattern.Add_on;

import com.design.pattern.Structural.Decorator_Pattern.Beverages;
import com.design.pattern.Structural.Decorator_Pattern.CondimentDecorator;

public class Sugar extends CondimentDecorator {
    Beverages beverage;
    public Sugar(Beverages beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+1.5;
    }

    @Override
    public String description() {
        return beverage.description()+", Sugar";
    }
}
