package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public  class Main {
    public static void main(String[] args) {
        //printThreeWords();
        //checkSumSign();
        //printColor();
        //compareNumbers();
        //System.out.println(checkSum(10,-2));
        //checkDigit(-1);
        //System.out.println(checkDigitSec(-1));
        //printRow("Кирпич",3);
        //System.out.println(checkYear());
        //swapArray();
        //fillArray();
        //increaseArray();
        cubeArray();
        //createArray(7,2);
    }

    //Задание-1
    static void printThreeWords(){
        System.out.println("Orange\n"+"Banana\n"+"Apple");
    }

    //Задание-2
    static void checkSumSign(){
        int a=1;
        int b=0;
        if((a+b)>=0) System.out.println("Сумма положительна");
        else System.out.println("Сумма отрицательна");
    }

    //Задание-3
    static void printColor(){
        int value = 101;
        if(value<=0) System.out.println("Красный");
        else if (0<value && value<=100) System.out.println("Желтый");
        else System.out.println("Зеленый");
    }

    //Задание-4
    static void compareNumbers(){
        int a=1;
        int b=2;
        if(a>=b) System.out.println("a>=b");
        else System.out.println("a<b");
    }

    //Задание-5
    static boolean checkSum(int first, int sec){
        if((first+sec)>=10 && (first+sec)<=20){
            return true;
        }
        else {
        return false;
        }
    }

    //Задание-6
    static void checkDigit(int digit){
        if(digit>=0) System.out.println("Положительное");
        else System.out.println("Отрицательное");
    }

    //Задание-7
    static boolean checkDigitSec(int digit){
        if(digit<0)return true;
        else return false;
    }

    //Задание-8
    static void printRow(String row,int digit){
        while (digit>0){
            System.out.println(row);
            digit--;
        }
    }

    //Задание-9
    static boolean checkYear() {
        int year = 900;
        boolean check = false;
        if (year % 4==0) {
            check=true;
            if(year%100==0){
                check=false;
                if(year%400==0){
                    check=true;
                }
            }
        }
        return check;
    }

    //Задание-10
    static void swapArray(){
        int[] array = new int[] {0,0,1,0,1,1};
        System.out.print("изначальный - ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        for(int i=0;i<array.length;i++){
            if(array[i]==0){
                array[i]=1;
            }
            else array[i]=0;
        }
        System.out.print("\nновый - ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    //Задание-11
    static void fillArray(){
        int[] array= new int[100];
        for(int i=0;i<array.length;i++){
            array[i]=i+1;
            System.out.println(array[i]);
        }
    }

    //Задание-12
    static void increaseArray(){
        int[] array = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("изначальный - ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        for(int i=0;i<array.length;i++){
            if(array[i]<6){
                array[i]*=2;
            }
        }
        System.out.print("\nновый - ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    //Задание-13
    static void cubeArray(){
        int[][]array=new int[5][5];
        int i =0;
        int j=0;
        int z=0;
        for( i=0;i<array.length;i++){
            for( j=0;j<array.length;j++){
                if(i==j){
                    array[i][j]=1;
                }
                else if(array.length-1-j==i){
                    array[i][j]=1;
                }
                else array[i][j]=0;
            }
        }
        for( i=0;i<array.length;i++){
            for( j=0;j<array.length;j++){
                System.out.print(array[i][j]);
                z++;
                if(z==array.length){
                    System.out.println("\n");
                    z=0;
                }
            }
        }
    }

    //Задание-14
    static int[] createArray(int len,int initialValue){
        int[] array = new int[len];
        for(int i:array){
            array[i]=initialValue;
            System.out.println(array[i]);
        }
        return array;
    }
}