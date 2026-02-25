package com.design.pattern.Structural.Decorator_Pattern;

public abstract class CondimentDecorator implements Beverages {
    Beverages beverages;
    CondimentDecorator(Beverages beverages){
        this.beverages = beverages;
    }

    public CondimentDecorator() {

    }
}
