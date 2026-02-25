package com.design.pattern.Structural.Decorator_Pattern.Concrete;

import com.design.pattern.Structural.Decorator_Pattern.Beverages;

public class Espresso implements Beverages {
    public Espresso() {
    }

    @Override
    public double cost() {
        return 2;
    }

    @Override
    public String description() {
        return "Espresso";
    }
}
