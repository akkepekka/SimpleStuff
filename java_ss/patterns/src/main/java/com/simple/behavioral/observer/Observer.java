package com.simple.behavioral.observer;

public interface Observer<C> {
    public void update(C context);
}
