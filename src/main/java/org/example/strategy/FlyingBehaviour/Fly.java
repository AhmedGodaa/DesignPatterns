package org.example.strategy.FlyingBehaviour;

import org.example.strategy.FlyBehaviour;

public class Fly implements FlyBehaviour {


    @Override
    public String fly() {
        return "Flying";
    }
}
