package com.simple.behavioral.visitor;

public class Blue implements BlueInterface {

    private String objectName;
    private int blueNumber;

    public Blue(String objectName, int redNumber) {
        this.objectName = objectName;
        this.blueNumber = redNumber;
    }

    public String getObjectName() {
        return this.objectName;
    }

    public int getBlueNumber(){
        return this.blueNumber;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
