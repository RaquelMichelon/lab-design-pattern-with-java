package com.raquelmichelon.singleton;

/**
 * It encapsulates the instance in a static intern class
 * It is tread safe
 * @see <a href="https://stackoverflow.com/a/24018148"> Ref </a>
 *
 * @author raqueldarellimichelon
 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    //it should be private, so no one can instantiate it.
    private SingletonLazyHolder() {
        super();
    }

    //to show the instance
    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instance;
    }
}
