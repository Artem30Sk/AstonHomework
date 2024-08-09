package org.example;

public interface Square {

    public default double squarePerimeter(double a) {
        double result = Math.pow(a,2);
        return result;
    }

    public default double squareArea(double a) {
        double result = 4 * a ;
        return result;
    }
}
