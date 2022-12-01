package org.example.strategy.FlyingBehaviour;

import org.example.strategy.FlyBehaviour;

public class FlyWithOneWing implements FlyBehaviour {
    @Override
    public String fly() {
        return "FlyWithOnWing";
    }
}
