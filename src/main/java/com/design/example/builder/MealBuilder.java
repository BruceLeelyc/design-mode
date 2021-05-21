package com.design.example.builder;

/**
 * @ClassName: MealBuilder
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 16:19
 */
public class MealBuilder {

    public static Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public static Meal prepareNoVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    public static Meal prepareVipMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        meal.addItem(new chips());
        return meal;
    }
}
