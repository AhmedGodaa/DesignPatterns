package org.example.strategy.DuckType;

import org.example.strategy.Duck;
import org.example.strategy.FlyingBehaviour.FlyWithOneWing;

public class SickDuck extends Duck {

  public SickDuck(){

      super(
              new FlyWithOneWing(),
              "SickDuck"
      );
  }
}
