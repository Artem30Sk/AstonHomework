package org.example;

public class TriangleClass implements Triangle{
    public String fillColor;

    public String borderColor;

    public double a;

    public double b;

    public double c;

    public double h;

    public double f;

    private double perimeter;

    private double area;

    public TriangleClass(String fillColor, String borderColor, double a, double b, double c, double h, double f){
        this.fillColor = fillColor;
        this.borderColor = borderColor;
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
        this.f = f;
    }
    public void printTriangle(){
        perimeter = trianglePerimeter(a, b, c);
        area = triangleArea(f, h);
        System.out.println("Периметр треугольника = " + perimeter + ", Площадь треугольника = " + area + ", Цвет фона = " + fillColor + ", Цвет границы = " + borderColor);
    }
}
