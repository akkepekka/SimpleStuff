package com.simple.behavioral.observer;

public interface Observable<C> {

    public void subscribe(Observer<C> observer);

    public void unsubscribe(Observer<C> observer);

    public void push(C context); // known elsewhere as 'notify'

}
