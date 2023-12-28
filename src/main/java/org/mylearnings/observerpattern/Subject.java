package org.mylearnings.observerpattern;

import java.util.ArrayList;

public class Subject {
    private  ArrayList<Observer> observers=new ArrayList<Observer>();

    public void registerObserver(Observer observer){
        observers.add(observer);
    }
    public void unregisterObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObserver(){
        for (Observer o:observers){
            o.update();
        }
    }
}
