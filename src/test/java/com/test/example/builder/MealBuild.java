package com.test.example.builder;

/**
 * @ClassName: MealBuild
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 17:38
 */
public class MealBuild {

    public static Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    public static Meal prepareNoVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public static Meal prepareVipMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        meal.addItem(new Chips());
        meal.addItem(new EggTart());
        return meal;
    }
}
