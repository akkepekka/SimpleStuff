package com.simple.behavioral.templatemethod;

public abstract class Template {
    public void templateMethod() {
        String string = createString();
        string = modifyStringHook(string);
        printString(string);
    }

    protected abstract String createString();

    private String modifyStringHook(String string) {
        return string;
    }

    private void printString(String string) {
        System.out.println(string);
    }
}
