package com.observer.pattern;

public class CreditObserver extends Observer {

    public CreditObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("New Credit Amount: " + this.subject.getState());
    }
}
