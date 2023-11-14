package org.courses6_4;

import annotation.Math;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

        SumOfNumbers sum = new SumOfNumbers();
        Class<? extends SumOfNumbers> cl = sum.getClass();
        try {
            Method method = cl.getDeclaredMethod("mathSum", int.class, int.class);
            Math math = method.getAnnotation(Math.class);
            sum.mathSum(math.num1(), math.num2());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

