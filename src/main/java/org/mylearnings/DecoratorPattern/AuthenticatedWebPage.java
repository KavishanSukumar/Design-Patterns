package org.mylearnings.DecoratorPattern;

public class AuthenticatedWebPage extends WebPageDecorator{

    public AuthenticatedWebPage(WebPage webPage) {
        super(webPage);
    }

    public void authenticateUser(){
        System.out.println("Authorizing User");
    }

    @Override
    public void display() {
        super.display();
        this.authenticateUser();
    }
}
