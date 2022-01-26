package com.observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private double state;

    public double getState() {
        return state;
    }

    public void setState(double state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        this.observers.add(observer);
    }
    
    public void notifyAllObservers() {
        for (Observer observer: this.observers) {
            observer.update();
        }
    }
}
