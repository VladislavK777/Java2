package com.javarush.task.task37.task3710.decorators;

import com.javarush.task.task37.task3710.shapes.Shape;

/**
 * Created by vladislavklockov on 14.07.17.
 */
public class RedShapeDecorator extends ShapeDecorator implements Shape {
    @Override
    public void draw() {
        setBorderColor(decoratedShape);
        decoratedShape.draw();
    }

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    private void setBorderColor(Shape shape) {
        String clazz = shape.getClass().getSimpleName();
        System.out.println("Setting border color for " + clazz + " to red.");
    }
}
