package com.simple.behavioral.observer;

/*
 * Find Observer in com.simple.behavioral.observer.Observer
 * 
 */
public class Subscriber<C> implements Observer<C> {
    public void update(C context) {
        // do stuff with context
    }
}
