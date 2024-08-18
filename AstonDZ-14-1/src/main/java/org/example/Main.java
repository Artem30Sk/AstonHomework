package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Факториал числа равен " + findFactrorial(number));
    }
    public static int findFactrorial(int number) {
        int result = 1;
        if(number < 0) {
            throw new IllegalArgumentException("The factorial cannot be calculated");
        }
        if(number == 0 || number == 1) {
            return result;
        }
        else {
            for (int i = 0; i < number; i++) {
                result *= i+1;
            }
            return result;
        }
    }
}