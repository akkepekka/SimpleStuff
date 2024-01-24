package com.simple.behavioral.strategy;

public class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(Data data) {
        strategy.execute(data);
    }
}
