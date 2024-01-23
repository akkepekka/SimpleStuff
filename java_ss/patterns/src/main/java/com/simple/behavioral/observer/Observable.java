package com.simple.behavioral.observer;

import javax.swing.event.DocumentEvent.EventType;

public interface Observable {

    public void subscribe(Observer observer);

    public void unsubscribe(Observer observer);

    public void push(EventType eve); // known elsewhere as 'notify'

}
