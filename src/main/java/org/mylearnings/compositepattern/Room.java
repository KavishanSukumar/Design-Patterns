package org.mylearnings.compositepattern;

public class Room implements IStructure {
    private String name;

    @Override
    public void enter() {
        System.out.println("You have entered the "+this.name);
    }

    @Override
    public void exit() {
        System.out.println("You left the "+this.name);
    }

    @Override
    public void location() {
        System.out.println("You are currently in the "+this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
