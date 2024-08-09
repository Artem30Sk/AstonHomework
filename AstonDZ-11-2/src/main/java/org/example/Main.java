package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CircleClass firstCircle = new CircleClass("Красный", "Черный",4);
        firstCircle.printCircle();
        SquareClass firstSquare = new SquareClass("Зеленый", "Черный",5.6);
        firstSquare.printSquare();
        TriangleClass firstTriangle = new TriangleClass("Желтый", "Черный",3,4,5,4,5);
        firstTriangle.printTriangle();
    }
}