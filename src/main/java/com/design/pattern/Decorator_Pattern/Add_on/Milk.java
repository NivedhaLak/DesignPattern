package com.design.pattern.Decorator_Pattern.Add_on;

import com.design.pattern.Decorator_Pattern.Beverages;
import com.design.pattern.Decorator_Pattern.CondimentDecorator;

public class Milk extends CondimentDecorator {
    Beverages beverage;
    public Milk(Beverages beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+2;
    }

    @Override
    public String description() {
        return beverage.description()+", Milk";
    }
}
