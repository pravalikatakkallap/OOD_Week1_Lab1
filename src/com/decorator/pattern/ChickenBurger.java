package com.decorator.pattern;

public class ChickenBurger implements Burger {
    @Override
    public String getBurgerType() {
        return "Chicken Burger";
    }

    @Override
    public double getBurgerPrice() {
        return 10.4;
    }
}
