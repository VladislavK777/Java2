package com.javarush.task.task15.task1530;

/**
 * Created by vladislavklockov on 12.05.17.
 */
public class LatteMaker extends DrinkMaker {

    public void getRightCup() {
        System.out.println("Берем чашку для латте");
    }

    public void putIngredient() {
        System.out.println("Делаем кофе");
    }

    public void pour() {
        System.out.println("Заливаем молоком с пенкой");
    }

    void makeDrink() {
        getRightCup();
        putIngredient();
        pour();
    }
}
