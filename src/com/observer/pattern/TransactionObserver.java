package com.observer.pattern;

public class TransactionObserver extends Observer {
    public TransactionObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("A new transaction was made to your account.");
    }
}
