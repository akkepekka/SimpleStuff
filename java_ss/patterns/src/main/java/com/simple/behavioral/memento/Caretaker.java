package com.simple.behavioral.memento;

import java.util.Stack;

public class Caretaker {
    private Originator originator;
    private Stack<Memento> history;

    public Caretaker(Originator originator) {
        this.originator = originator;
        this.history = new Stack<Memento>();
    }

    public void dodo() {
        final Memento memento = originator.save(); 
        this.history.push(memento);
    }

    public void undo(){
        this.history.pop().restore();
    }
}
