package org.example;

public class SquareClass implements Square {

    public String fillColor;

    public String borderColor;

    public double a;

    private double perimeter;

    private double area;

    public SquareClass(String fillColor, String borderColor, double a){
        this.fillColor = fillColor;
        this.borderColor = borderColor;
        this.a = a;
    }

    public void printSquare(){
        perimeter = squarePerimeter(a);
        area = squareArea(a);
        System.out.println("Периметр квадрата = " + perimeter + ", Площадь квадрата = " + area + ", Цвет фона = " + fillColor + ", Цвет границы = " + borderColor);
    }
}
