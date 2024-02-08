package com.simple.behavioral.state;

public class LightGreen extends StateReact{
   
    private String light = "green";

    public LightGreen(Context context) {
        super(context);
    }

    public void trafficStop() {
        super.context.changeState(new LightYellow(context));
    }

    public void trafficMove() {    
        return;
    }

    public String getState() {
        return this.light;
    }
}
