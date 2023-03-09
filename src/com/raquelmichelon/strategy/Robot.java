package com.raquelmichelon.strategy;

public class Robot {
    private IBehavior strategy;

    //case the robot change its strategy
    public void setStrategy(IBehavior strategy) {
        this.strategy = strategy;
    }

    //to do the robot moves
    public void move() {
        strategy.move();
    }
}
