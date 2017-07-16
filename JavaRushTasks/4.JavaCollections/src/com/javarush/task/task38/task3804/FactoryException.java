package com.javarush.task.task38.task3804;

/**
 * Created by vladislavklockov on 16.07.17.
 */
public class FactoryException {
    public static Object getException(Enum e) {
        if (e == null) {
            return new IllegalArgumentException();
        }

        String message = e.name().charAt(0) + e.name().substring(1).toLowerCase().replace("_", " ");

        if (e instanceof ExceptionApplicationMessage) {
            return new Exception(message);
        }

        if (e instanceof ExceptionDBMessage) {
            return new RuntimeException(message);
        }

        if (e instanceof  ExceptionUserMessage) {
            return new Error(message);
        }

        return new IllegalArgumentException();
    }
}
