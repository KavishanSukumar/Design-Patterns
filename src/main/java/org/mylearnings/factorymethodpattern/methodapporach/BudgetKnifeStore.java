package org.mylearnings.factorymethodpattern.methodapporach;

public class BudgetKnifeStore implements KnifeStore{
    @Override
    public Knife createKnife() {
        return new BudgetChefsKnife();
    }
}
