package com.simple.behavioral.memento;

public class ConcreteOriginator implements Originator {
    private State state;

    public ConcreteOriginator(State state) {
        this.state = state;
    }

    public Memento save() {
        return new ConcreteMemento(this, this.state); 
    }

    public void setState(State state) {
        this.state = state;
    }
}
