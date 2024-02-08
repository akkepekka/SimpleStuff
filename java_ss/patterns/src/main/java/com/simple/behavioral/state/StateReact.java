package com.simple.behavioral.state;

public abstract class StateReact implements State {
    protected Context context;

    public StateReact(Context context) {
        this.context = context;
    } 
    
    public void emergencyVehicleIncoming() {
        this.context.changeState(new LightGreen(this.context));
    }

    public void fault() {
        this.context.changeState(new LightYellow(this.context));
    }
}
