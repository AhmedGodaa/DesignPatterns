package org.example.strategy.DuckType;

import org.example.strategy.Duck;
import org.example.strategy.FlyingBehaviour.Fly;

public class FlyingDuck extends Duck {

    public FlyingDuck() {
        super(
                new Fly(),
                "Flying Duck"
        );
    }


}
