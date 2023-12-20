package org.mylearnings.singleton;

public class ExampleSingleton {
    private static ExampleSingleton exampleSingleton=null;

    //as the constructor is private we can't access the constructor outside the class
    private ExampleSingleton(){

    }

    //this is lazy creation object is created only when needed use ful when there is a trade off of having multiple objects
    public static ExampleSingleton getInstance(){
        if (exampleSingleton==null) exampleSingleton = new ExampleSingleton();
        return exampleSingleton;
    }

}

//singleton as a trade off when having multiple treads
