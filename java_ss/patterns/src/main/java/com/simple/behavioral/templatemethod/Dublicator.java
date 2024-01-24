package com.simple.behavioral.templatemethod;

public class Dublicator extends Template{
    
    protected String createString() {
        return "String to be dublicated";
    }

    @Override 
    private String modifyStringHook(String string) {
        return string + string;
    }
}
