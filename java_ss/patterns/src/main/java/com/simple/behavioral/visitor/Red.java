package com.simple.behavioral.visitor;

public class Red implements RedInterface{
 
    private String objectName;
    private int redNumber;

    public Red(String objectName, int redNumber) {
        this.objectName = objectName;
        this.redNumber = redNumber;
    }

    public String getObjectName() {
        return this.objectName;
    }

    public int getRedNumber(){
        return this.redNumber;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
