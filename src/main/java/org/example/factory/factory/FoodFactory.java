package org.example.factory.factory;

import org.example.factory.FoodType.Food;

public interface FoodFactory {
    Food createFood(String... type);
}
