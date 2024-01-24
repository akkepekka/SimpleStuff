package com.simple.behavioral.visitor;

/*
 * Find Visitor in com.simple.behavioral.visitor.Visitor
 * 
 */
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
