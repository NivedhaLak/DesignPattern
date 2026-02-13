package com.design.pattern.Decorator_Pattern;

public abstract class CondimentDecorator implements Beverages {
    Beverages beverages;
    CondimentDecorator(Beverages beverages){
        this.beverages = beverages;
    }

    public CondimentDecorator() {

    }
}
