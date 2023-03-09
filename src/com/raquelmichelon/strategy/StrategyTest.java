package com.raquelmichelon.strategy;

public class StrategyTest {
    public static void main(String[] args) {

        IBehavior behaviorDefault = new BehaviorDefault();
        IBehavior behaviorDefensive = new BehaviorDefensive();
        IBehavior behaviorAgressive = new BehaviorAggressive();

        Robot robot = new Robot();
        robot.setStrategy(behaviorDefault);
        robot.move();
        robot.move();
        robot.setStrategy(behaviorDefensive);
        robot.move();
        robot.setStrategy(behaviorAgressive);
        robot.move();

    }
}
