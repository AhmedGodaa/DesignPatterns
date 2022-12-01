package org.example.strategy;

import org.example.strategy.FlyingBehaviour.Fly;

public abstract class Duck {
    private int id;
    private String name;
    private FlyBehaviour flyBehaviour;
    private static int counter = 0;

    public Duck(FlyBehaviour flyBehaviour, String name) {
        this.id = counter++;
        this.name = name;
        this.flyBehaviour = flyBehaviour;
    }

    public void perform() {
        System.out.println(this.flyBehaviour.fly());
    }


}
