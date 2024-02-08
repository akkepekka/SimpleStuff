package com.simple.behavioral.state;

public class TrafficLight implements Context{
    private State state;

    public TrafficLight(State state) {
        this.state = state;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public String getLightColor() {
        return this.state.getState();
    }
}
