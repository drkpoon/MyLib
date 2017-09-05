package com.user.derekpoon.trigolibrary;

/**
 * Created by user on 5/9/2017.
 */

public class Compute {
    public static double rectangleArea(double width, double height) {
        return width * height;
    }

    public static double triangleArea(double a, double b, double c) {
        // Heron's formula
        double s = 0.5f * (a + b + c);
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
