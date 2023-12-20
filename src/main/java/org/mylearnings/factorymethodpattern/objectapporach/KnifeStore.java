package org.mylearnings.factorymethodpattern.objectapporach;

public class KnifeStore {
    private KnifeFactory knifeFactory;

    KnifeStore(KnifeFactory knifeFactory){
        this.knifeFactory=knifeFactory;
    }

    void orderKnife(String type){
        Knife knife=knifeFactory.createKnife(type);
        if (knife != null) {
            knife.sharpen();
            knife.polish();
            knife.packageknife();
        } else {
            // Handle invalid type
        }
    }
}
