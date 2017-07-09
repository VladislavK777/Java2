package com.javarush.task.task24.task2409;

/**
 * Created by vladislavklockov on 04.06.17.
 */
public interface Jeans extends Item {
    int getLength();
    int getSize();

    @Override
    int getId();

    @Override
    double getPrice();

    @Override
    String getTM();
}
