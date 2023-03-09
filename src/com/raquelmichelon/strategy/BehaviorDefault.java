package com.raquelmichelon.strategy;

public class BehaviorDefault implements IBehavior {

    @Override
    public void move() {
        System.out.println("The robot is moving.");
    }
}
