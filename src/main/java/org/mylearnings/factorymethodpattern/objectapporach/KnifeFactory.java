package org.mylearnings.factorymethodpattern.objectapporach;

public class KnifeFactory {
    Knife createKnife(String type){
        if (type.equalsIgnoreCase("Steak")) {
            return new SteakKnife();
        } else if (type.equalsIgnoreCase("Chefs")) {
            return new ChefKnife();
        }
        return null;
    }
}
