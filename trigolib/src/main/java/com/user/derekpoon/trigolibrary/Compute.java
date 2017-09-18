package com.user.derekpoon.trigolibrary;

/**
 * Created by Derek Poon on 5/9/2017.
 * Maven library demo
 */

public class Compute {
    public static double rectangleArea(double width, double height) {
        return width * height;
    }

    /**
     *
     * @param a side A
     * @param b side B
     * @param c side C
     * @return area of triangle
     * @deprecated  use Triangle class.
     */
    public static double triangleArea(double a, double b, double c) {
        // Heron's formula
        double s = 0.5f * (a + b + c);
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static boolean validTriangle(double a, double b, double c) {
        return ((a + b) >= c && (b + c) > a && (a + c) > b);
    }
}
