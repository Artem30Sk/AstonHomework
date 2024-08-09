package org.example;

public class Cat extends Animal{

    final public int mealMinimum;
    public boolean satiety = false;
    final private int runMax = 200;
    public static int countCat = 0;

    { countCat+=1; }
    public Cat(String name,int mealMinimum) {
        super(name);
        this.mealMinimum = mealMinimum;
    }
    @Override
    public void run(int distance) {
        String result = (runMax < distance) ? "Слишком большое расстояние для кота" : String.format("Кот %s пробежал %d м.", name, distance);
        System.out.println(result);
    }
    @Override
    public void swim(int distance) {
        System.out.println("Коты не умеют плавать");
    }
    public void printCountCat(){
        System.out.println("Всего котов " + countCat);
    }

}
