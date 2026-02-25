package com.design.pattern.Structural.Decorator_Pattern.Concrete;

import com.design.pattern.Structural.Decorator_Pattern.Beverages;

public class DarkRoast implements Beverages {
    public DarkRoast() {
    }

    @Override
    public double cost() {
        return 3;
    }

    @Override
    public String description() {
        return "DarkRoast";
    }
}
