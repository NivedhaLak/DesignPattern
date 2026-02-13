package com.design.pattern.Decorator_Pattern.HelperFactory;

import com.design.pattern.Decorator_Pattern.Add_on.AddonENUM;
import com.design.pattern.Decorator_Pattern.Add_on.Milk;
import com.design.pattern.Decorator_Pattern.Add_on.Sugar;
import com.design.pattern.Decorator_Pattern.Beverages;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class CondimentFactory {
    private static Map<AddonENUM, Function<Beverages,Beverages>> beverageRegistry=new HashMap<>();

    static {
        beverageRegistry.put(AddonENUM.MILK, Milk::new);
        beverageRegistry.put(AddonENUM.SUGAR, Sugar::new);
    }

    public static Beverages addCondiment(String addOn, Beverages beverages){
        Function<Beverages,Beverages> beveragesFunction = beverageRegistry.get(AddonENUM.valueOf(addOn.toUpperCase()));
        if(beveragesFunction == null){
            throw new RuntimeException("Failous in creating add - on :"+ addOn);
        }
        return beveragesFunction.apply(beverages);
    }
}
