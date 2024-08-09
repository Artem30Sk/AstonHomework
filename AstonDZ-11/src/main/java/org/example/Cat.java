package org.example;

public class Cat extends Animal{

    final int mealMinimum;
    final private int runMax = 200;
    public static int countCat = 0;
    {countCat+=1;}

    public boolean satiety = false;
    public Cat(String name,int _mealMinimum) {
        super(name);
        this.mealMinimum = _mealMinimum;
    }
    @Override
    public void run(int distance) {
        super.run(distance);
        String result = runMax < distance ? "Слишком большое расстояние для кота" : String.format("Кот %s пробежал %d м.",name,distance);
        System.out.println(result);
    }
    @Override
    public void swim(int distance) {
        super.swim(distance);
        System.out.println("Коты не умеют плавать");
    }
    public void printCat(){
        System.out.println("Всего котов " + countCat);
    }

}
