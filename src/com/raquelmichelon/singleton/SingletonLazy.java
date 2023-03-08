package com.raquelmichelon.singleton;

/**
 * SingletonLazy does not provide an instance for the user
 * @author raqueldarellimichelon
 */
public class SingletonLazy {

    private static SingletonLazy instance;

    //it should be private, so no one can instantiate it.
    private SingletonLazy() {
        super();
    }

    //to show the instance
    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
