package com.simple.behavioral.observer;

public interface Observable {

    public void subscribe(Observer observer);

    public void unsubscribe(Observer observer);

    public void push(EventType eve); // known elsewhere as 'notify'

}
