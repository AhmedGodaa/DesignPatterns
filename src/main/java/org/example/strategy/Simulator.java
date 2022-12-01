package org.example.strategy;

import org.example.strategy.DuckType.FlyingDuck;
import org.example.strategy.DuckType.RubberDuck;
import org.example.strategy.DuckType.SickDuck;

public class Simulator {

    public static void main(String[] args) {
        Duck flyingDuck = new FlyingDuck();
        flyingDuck.perform();
        Duck rubberDuck = new RubberDuck();
        rubberDuck.perform();
        Duck sickDuck = new SickDuck();
        sickDuck.perform();


    }

}
