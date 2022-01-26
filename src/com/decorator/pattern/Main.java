package com.decorator.pattern;

public class Main {

    public static void main(String[] args) {
	    Burger chickenBurger = new ChickenBurger();
        Burger cheeseBurger = new ChickenCheeseBurger(new ChickenBurger());
        Burger pattyBurger = new ChicketPattyBurger(new ChickenBurger());

        System.out.println("-------- Chicken Burger Details --------");
        System.out.println("Burger Type: " + chickenBurger.getBurgerType());
        System.out.println("Burger Price: "  + chickenBurger.getBurgerPrice());

        System.out.println("\n-------- Chicken Cheese Burger Details --------");
        System.out.println("Burger Type: " + cheeseBurger.getBurgerType());
        System.out.println("Burger Price: "  + cheeseBurger.getBurgerPrice());

        System.out.println("\n-------- Chicken Patty Burger Details --------");
        System.out.println("Burger Type: " + pattyBurger.getBurgerType());
        System.out.println("Burger Price: "  + pattyBurger.getBurgerPrice());
    }
}
