package org.mylearnings.DecoratorPattern;

public class BasicWebPage implements WebPage{
    private String html;
    private String stylesheet;
    private String scripts;
    @Override
    public void display() {
        System.out.println("Basic Web Page");
    }
}
