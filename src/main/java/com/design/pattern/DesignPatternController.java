package com.design.pattern;

import com.design.pattern.Decorator_Pattern.Beverages;
import com.design.pattern.Decorator_Pattern.BeveragesVO;
import com.design.pattern.Decorator_Pattern.Concrete.Espresso;
import com.design.pattern.Decorator_Pattern.HelperFactory.BeveragesFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DesignPatternController {
    @GetMapping("welcome")
    public String welcome(){
        return "welcome to Design Pattern";
    }

    @GetMapping(value = "/decorator",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<BeveragesVO> decorator(@RequestParam String addon, @RequestParam String beverage){
        Beverages beverages = BeveragesFactory.getBeverages(beverage);
        beverages = BeveragesFactory.buildCondiment(addon,beverages);
        BeveragesVO vo = new BeveragesVO(beverages.cost(), beverages.description());
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }
}
