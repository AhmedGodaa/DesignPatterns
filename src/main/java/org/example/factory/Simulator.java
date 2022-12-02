package org.example.factory;

import org.example.factory.FoodType.Food;
import org.example.factory.FoodType.FoodA;
import org.example.factory.factory.FoodFactoryImplementation;

public class Simulator {

    public static void main(String[] args) {
        FoodFactoryImplementation foodFactory = new FoodFactoryImplementation();
        Food food = foodFactory.createFood("B");
        System.out.println(food.name);




    }
}
