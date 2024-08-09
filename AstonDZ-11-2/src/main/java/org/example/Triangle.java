package org.example;

public interface Triangle {

    public default double trianglePerimeter(double a, double b, double c) {
        double result = a + b + c;
        return result;
    }

    public default double triangleArea(double f, double h) {
        double result = ( f * h ) / 2;
        return result;
    }
}
