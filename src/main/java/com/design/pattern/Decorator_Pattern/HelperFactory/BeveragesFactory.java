package com.design.pattern.Decorator_Pattern.HelperFactory;

import com.design.pattern.Decorator_Pattern.Add_on.AddonENUM;
import com.design.pattern.Decorator_Pattern.Add_on.Milk;
import com.design.pattern.Decorator_Pattern.Add_on.Sugar;
import com.design.pattern.Decorator_Pattern.Beverages;
import com.design.pattern.Decorator_Pattern.Concrete.BeverageENUM;
import com.design.pattern.Decorator_Pattern.Concrete.DarkRoast;
import com.design.pattern.Decorator_Pattern.Concrete.Espresso;
import com.design.pattern.Decorator_Pattern.Concrete.HouseBlend;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class BeveragesFactory {

    private static Map<BeverageENUM, Supplier<Beverages>> beverageRegistry=new HashMap<>();

    static {
        beverageRegistry.put(BeverageENUM.ESPRESSO, Espresso::new);
        beverageRegistry.put(BeverageENUM.DARKROAST, DarkRoast::new);
        beverageRegistry.put(BeverageENUM.HOUSEBLEND, HouseBlend::new);
    }

    public static Beverages getBeverages(String beverage){
        Supplier<Beverages> beveragesFunction = beverageRegistry.get(BeverageENUM.valueOf(beverage.toUpperCase()));
        if(beveragesFunction == null){
            throw new RuntimeException("Failous in creating add - on :"+ beverage);
        }
        return beveragesFunction.get();
    }

    public static Beverages buildCondiment(String condition, Beverages base){
        String condiments[] = condition.split("\\ ");
        for(String condiment: condiments){
            base = CondimentFactory.addCondiment(condiment, base);
        }
        return base;
    }


}
