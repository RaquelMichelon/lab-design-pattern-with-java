package com.raquelmichelon.strategy;

public class BehaviorAggressive implements IBehavior {

    @Override
    public void move() {
        System.out.println("The robot is moving aggressively.");
    }
}
