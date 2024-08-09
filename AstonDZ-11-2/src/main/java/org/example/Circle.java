package org.example;

public interface Circle {

    public default double circlePerimeter(double r) {
        double result = 2 * Math.PI * r;
        return result;
    }

    public default double circleArea(double r) {
        double result = Math.PI * Math.pow(r,2);
        return result;
    }
}
