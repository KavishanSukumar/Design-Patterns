package org.mylearnings.DecoratorPattern;

public class AuthorizedWebPage extends WebPageDecorator {

    public AuthorizedWebPage(WebPage decoratedPage) {
        super(decoratedPage);
    }
    public void authorizedUser(){
        System.out.println("Authorizing User");
    }

    @Override
    public void display() {
        super.display();
        this.authorizedUser();
    }
}
