package com.simple.behavioral.state;

public class LightYellow extends StateReact {
    
    private String light = "yellow";

    public LightYellow(Context context) {
        super(context);
    }

    public void trafficStop() {
        super.context.changeState(new LightRed(context));
    }

    public void trafficMove() {    
        super.context.changeState(new LightGreen(context));
    }

    public String getState() {
        return this.light;
    }
}
