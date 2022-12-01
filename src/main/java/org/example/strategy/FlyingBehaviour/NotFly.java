package org.example.strategy.FlyingBehaviour;

import org.example.strategy.FlyBehaviour;

public class NotFly implements FlyBehaviour {
    @Override
    public String fly() {
        return "NotFlying";
    }
}
