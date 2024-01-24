package com.simple.behavioral.observer;

import java.util.ArrayList;

/*
 * Find Observable in com.simple.behavioral.observer.Observable
 * 
 */
public class Publisher<C> implements Observable<C>{

    private ArrayList<Observer<C>> observers;

    public Publisher() {
        this.observers = new ArrayList<Observer<C>>();
    }

    public void subscribe(Observer<C> observer) {
        this.observers.add(observer);
    }

    public void unsubscribe(Observer<C> observer) {
        this.observers.removeIf(n -> n.equals(observer));
    }

    public void push(C context){
        for (Observer<C> observer : observers) {
            observer.update(context);
        }
    }
}
