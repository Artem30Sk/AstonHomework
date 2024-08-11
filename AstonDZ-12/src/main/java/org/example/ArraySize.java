package org.example;

public class ArraySize {
    String[][] array = {
        {"1", "2", "3", "4"},
        {"1", "2", "3", "4"},
        {"1", "2", "3", "4"},
        {"1", "2", "3", "4"}
    };
    public void checkArray() throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if(array.length != 4) throw new MyArraySizeException();
        for (int i = 0; i < array.length; i++) { if(array[i].length != 4) throw new MyArraySizeException(); }
        for (int i = 0; i < array.length; i++){
            for ( int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println("Ошибок не обнаружено, сумма значений массива = " + sum);
    }
}
