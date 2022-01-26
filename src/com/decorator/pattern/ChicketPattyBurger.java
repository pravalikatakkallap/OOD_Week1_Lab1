package com.decorator.pattern;

public class ChicketPattyBurger extends BurgerDecorator{
    public ChicketPattyBurger(Burger burger) {
        super(burger);
    }

    public String getBurgerType() {
        return super.getBurgerType() + " with double patty!";
    }

    public double getBurgerPrice() {
        return super.getBurgerPrice() + 8.7;
    }
}
