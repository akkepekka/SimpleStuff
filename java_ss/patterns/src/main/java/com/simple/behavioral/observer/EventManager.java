package com.simple.behavioral.observer;

import java.util.Map;

import java.util.ArrayList;
import java.util.HashMap;


public class EventManager<E,C> {
    
    private Map<E,ArrayList<Observer<C>>> eventTypes;

    public EventManager() {
        this.eventTypes = new HashMap<E,ArrayList<Observer<C>>>();
    }

    public void subscribe(E eventType, Observer<C> observer) {
        if (this.eventTypes.containsKey(eventType)) {
            this.eventTypes.get(eventType).add(observer);
        } else {
            ArrayList<Observer<C>> array = new ArrayList<Observer<C>>();
            array.add(observer);
            this.eventTypes.put(eventType, array); 
        }
    }

    public void unsubscribe(E eventType, Observer<C> observer) {
        this.eventTypes.get(eventType).removeIf(n -> n.equals(observer));
    }

    public void push(E eventType, C context) {
        for ( Observer<C> observer : this.eventTypes.get(eventType)) {
            observer.update(context);
        }
    }

}
