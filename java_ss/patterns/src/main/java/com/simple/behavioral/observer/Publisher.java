package com.simple.behavioral.observer;

import java.util.ArrayList;

public class Publisher implements Observable{

    private ArrayList<Observer> observers;

    public Publisher() {
        this.observers = new ArrayList<Observer>();
    }

    public void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        this.observers.removeIf(n -> n.equals(observer));
    }

    public void push(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
