package org.mylearnings.templatemethodpattern;

public class SpaghettiMeatBalls extends PastaDish{
    @Override
    protected void addPasta() {
        System.out.println("Add spaghetti");
    }

    @Override
    protected void addSauce() {
        System.out.println("Add tomato sauce");
    }

    @Override
    protected void addProtein() {
        System.out.println("Add meatballs");
    }

    @Override
    protected void addGarnish() {
        System.out.println("Add cheese");
    }
}
