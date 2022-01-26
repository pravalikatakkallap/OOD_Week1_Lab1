package com.decorator.pattern;

public class ChickenCheeseBurger extends BurgerDecorator {

    public ChickenCheeseBurger(Burger burger) {
        super(burger);
    }

    public String getBurgerType() {
        return super.getBurgerType() + " with cheese";
    }

    public double getBurgerPrice() {
        return super.getBurgerPrice() + 5.2;
    }
}
