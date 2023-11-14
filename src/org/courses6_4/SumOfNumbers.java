package org.courses6_4;

import annotation.Math;

public class SumOfNumbers {

    @Math(num1 = 100, num2 = 200)
    public void mathSum(int num1, int num2){
        System.out.println(num1 + num2);
    }
}
