package org.mylearnings.factorymethodpattern.methodapporach;

public class QualityKnifeStore implements KnifeStore{
    @Override
    public Knife createKnife() {
        return new QualitySteakKnife();
    }
}
