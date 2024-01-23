package com.simple.behavioral.visitor;

public class VisitorStringify implements Visitor {
    
    private String string = "";

    public void visit(Blue blue) {
        this.string += "< " + blue.getObjectName() + "," + blue.getBlueNumber() + " >";
    }
  
    public void visit(Red red) {
        this.string += "< " + red.getObjectName() + "," + red.getRedNumber() + " >";
    }

    public String getString(){
        return this.string;
    }
    
}
