package com.observer.pattern;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new TransactionObserver(subject);
        new CreditObserver(subject);

        System.out.println("Perform state update....");
        subject.setState(410.41);
    }
}
