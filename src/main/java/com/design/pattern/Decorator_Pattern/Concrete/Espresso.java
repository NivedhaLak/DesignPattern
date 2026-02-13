package com.design.pattern.Decorator_Pattern.Concrete;

import com.design.pattern.Decorator_Pattern.Beverages;

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
