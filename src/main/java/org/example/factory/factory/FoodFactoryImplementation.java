package org.example.factory.factory;

import org.example.factory.FoodType.Food;
import org.example.factory.FoodType.FoodA;
import org.example.factory.FoodType.FoodB;
import org.example.factory.FoodType.FoodC;

public class FoodFactoryImplementation implements FoodFactory {
    @Override
    public Food createFood(String... type) {
        String myType = type[0];
        Food food = null;
        if (myType.equals("A")) {
            food = new FoodA();
        } else if (myType.equals("B")) {
            food = new FoodB();
        } else if (myType.equals("C")) {
            food = new FoodC();
        }
        return food;
    }
}
