package org.example;

public class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        super("ERROR! неверный размер массива");
    }
}
