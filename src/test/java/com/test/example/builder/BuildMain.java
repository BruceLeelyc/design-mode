package com.test.example.builder;

/**
 * @ClassName: BuildMain
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 17:40
 */
public class BuildMain {

    public static void main(String[] args) {

        Meal meal = MealBuild.prepareNoVegMeal();
        System.out.println("不吃肉的套餐:");
        float cost = meal.getCost();
        System.out.println("共消费:"+cost);
        meal.showItem();

        Meal vegMeal = MealBuild.prepareVegMeal();
        System.out.println("鸡肉套餐:");
        float vegCost = vegMeal.getCost();
        System.out.println("共消费:"+vegCost);
        vegMeal.showItem();

        Meal vipMeal = MealBuild.prepareVipMeal();
        System.out.println("VIP套餐:");
        float vipCost = vipMeal.getCost();
        System.out.println("共消费:"+vipCost);
        vipMeal.showItem();
    }
}
