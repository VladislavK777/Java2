package com.javarush.task.task38.task3809;

import java.lang.annotation.*;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value = ElementType.FIELD)
public @interface LongPositive {
}
