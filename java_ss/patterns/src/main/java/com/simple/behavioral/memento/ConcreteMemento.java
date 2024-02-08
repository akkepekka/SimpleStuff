package com.simple.behavioral.memento;

public class ConcreteMemento implements Memento {
    private State state;
    private ConcreteOriginator originator;

    public ConcreteMemento(ConcreteOriginator originator, State state) {
        this.state = state;
        this.originator = originator;
    }

    public void restore() {
        this.originator.setState(this.state);
    }
}
