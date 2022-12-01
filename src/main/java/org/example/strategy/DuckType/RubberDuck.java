package org.example.strategy.DuckType;

import org.example.strategy.Duck;
import org.example.strategy.FlyBehaviour;
import org.example.strategy.FlyingBehaviour.NotFly;

public class RubberDuck  extends Duck {

public RubberDuck(){
    super(
            new NotFly(),
            "RubberDuck"
    );
}

}
