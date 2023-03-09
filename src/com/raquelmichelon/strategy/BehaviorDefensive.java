package com.raquelmichelon.strategy;

public class BehaviorDefensive implements IBehavior {

    @Override
    public void move() {
        System.out.println("The robot is moving defensively.");
    }
}
