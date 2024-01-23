package com.simple;

import java.util.ArrayList;

import com.simple.behavioral.visitor.*;

public class App 
{
    public static void main( String[] args )
    {
        VisitorStringify visitor = new VisitorStringify();
        
        ArrayList<Visitable> array = new ArrayList<Visitable>();
        array.add(new Red("redman", 1));
        array.add(new Blue("blueman",2));

        for (Visitable visitable : array) {
            visitable.accept(visitor);

        System.out.println(visitor.getString());
        } 
    }
}
