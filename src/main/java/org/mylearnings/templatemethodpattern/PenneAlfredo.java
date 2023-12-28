package org.mylearnings.templatemethodpattern;

public class PenneAlfredo extends PastaDish{
    @Override
    protected void addPasta() {
        System.out.println("Add penne");
    }

    @Override
    protected void addSauce() {
        System.out.println("Add Adfredo sauce");
    }

    @Override
    protected void addProtein() {
        System.out.println("Add Chicken");
    }

    @Override
    protected void addGarnish() {
        System.out.println("Add parsley");
    }
}
