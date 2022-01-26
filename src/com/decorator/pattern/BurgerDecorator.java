package com.decorator.pattern;

public abstract class BurgerDecorator implements Burger {
    private Burger newBurger;

    public BurgerDecorator(Burger burger) {
        this.newBurger = burger;
    }

    @Override
    public String getBurgerType() {
        return newBurger.getBurgerType();
    }

    @Override
    public double getBurgerPrice() {
        return newBurger.getBurgerPrice();
    }
}
