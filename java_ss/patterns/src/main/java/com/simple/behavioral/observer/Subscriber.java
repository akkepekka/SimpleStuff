package com.simple.behavioral.observer;

public class Subscriber<C> implements Observer<C> {
    public void update(C context) {
        // do stuff with context
    }
}
