package org.example;

public class CircleClass implements Circle{
    public String fillColor;

    public String borderColor;

    public double r;

    private double perimeter;

    private double area;

    public CircleClass(String fillColor, String borderColor, double r){
        this.fillColor = fillColor;
        this.borderColor = borderColor;
        this.r = r;
    }
    public void printCircle(){
        perimeter = circlePerimeter(r);
        area = circleArea(r);
        System.out.println("Периметр круга = " + perimeter + ", Площадь круга = " + area + ", Цвет фона = " + fillColor + ", Цвет границы = " + borderColor);
    }
}
