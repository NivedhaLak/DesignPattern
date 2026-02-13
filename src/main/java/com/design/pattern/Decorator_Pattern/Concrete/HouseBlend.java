package com.design.pattern.Decorator_Pattern.Concrete;

import com.design.pattern.Decorator_Pattern.Beverages;

public class HouseBlend implements Beverages {
    public HouseBlend(){}

    @Override
    public double cost() {
        return 1;
    }

    @Override
    public String description() {
        return "HouseBlend";
    }
}
