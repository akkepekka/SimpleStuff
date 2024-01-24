package com.simple.behavioral.observer;

import java.util.Map;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * Alternative to Observable, a class that holds multiple Observables
 * in order to centralize event management.
 * 
 * - EventType<E> is used as a key to find spesific event to observe.
 * - Context<C> is used to transmit event data to Observers from the
 * Observables.
 * 
 */
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
