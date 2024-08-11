package org.example;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(int i, int j) {
        super("ERROR! в ячейке (" + i + ", " + j + ")");
    }
}
