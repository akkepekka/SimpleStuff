package com.simple.behavioral.state;

public class LightRed extends StateReact {
    
    private String light = "red";

    public LightRed(Context context) {
        super(context);
    }

    public void trafficStop() {
        return;
    }

    public void trafficMove() {    
        super.context.changeState(new LightYellow(context));
    }

    public String getState() {
        return this.light;
    }
}
