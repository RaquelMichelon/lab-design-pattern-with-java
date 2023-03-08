package com.raquelmichelon.singleton;

public class SingletonTest {
    public static void main(String[] args) {

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        //get a new instance to see if it will be the same as expected
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy); //yes, it is the same memory address

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager); //yes, it is the same memory address

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder); //yes, it is the same memory address

    }
}
