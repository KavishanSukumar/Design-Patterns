package org.mylearnings.templatemethodpattern;

public abstract class PastaDish {

    //final implies that this cannot be overwritten by subclasses
    public final void makeRecipe(){
        boilWater();
        addPasta();
        cookPasta();
        drainAndPlate();
        addSauce();
        addProtein();
        addGarnish();

    }

    protected void drainAndPlate() {
    }

    protected void cookPasta() {
    }

    protected abstract void addPasta();
    protected abstract void addSauce();
    protected abstract void addProtein();
    protected abstract void addGarnish();

    private void boilWater(){
        System.out.println("Boiling water");
    }

}
