package org.mylearnings.factorymethodpattern.methodapporach;

public interface KnifeStore {
    Knife createKnife();

    default void orderKnife(){
        Knife knife=createKnife();
        if (knife != null) {
            knife.sharpen();
            knife.polish();
            knife.packageknife();
        } else {
            // Handle case if knife creation fails
        }
    }
}
