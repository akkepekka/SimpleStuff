package com.simple.behavioral.observer;

import java.util.Map;

import java.util.ArrayList;


public class EventManager implements Observable {
    
    private Map<Object,ArrayList<Observer>> eventTypes;

    public EventManager() {
        this.eventTypes = new Map<Object,ArrayList<Observer>>();
    }

    public void subscribe(Object eventType, Observer observer) {
        if (this.eventTypes.containsKey(eventType)) {
            this.eventTypes.get(eventType).add(observer);
        } else {
            ArrayList<Observer> array = new ArrayList<Observer>();
            array.add(observer);
            this.eventTypes.put(eventType, array); 
        }
    }

    public void unsubscribe(EventType eventType, Observer observer) {
        this.eventTypes.get(eventType).removeIf(n -> n.equals(observer));
    }

    public push(Object eventType, Context context) {
        for ( Observer observer : this.eventTypes.get(eventType)) {
            observer.update(context);
        }
    }

}
