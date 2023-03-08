package com.raquelmichelon.singleton;

/**
 * The instance is created in the moment it is defined
 * when the class is called, it will be ready to be used
 * @author raqueldarellimichelon
 */
public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();;

    //it should be private, so no one can instantiate it.
    private SingletonEager() {
        super();
    }

    //to show the instance
    public static SingletonEager getInstance() {
        return instance;
    }
}
