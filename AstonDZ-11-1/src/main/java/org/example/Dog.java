package org.example;

public class Dog extends Animal {
    final private int runMax = 500;
    final private int swimMax = 10;
    public static int countDog = 0;

    { countDog+=1; }
    public Dog(String name) {
        super(name);
    }
    @Override
    public void run(int distance) {
        String result = (runMax < distance) ? "Слишком большое расстояние для собаки" : String.format("Собака %s пробежал %d м.", name, distance);
        System.out.println(result);
    }

    @Override
    public void swim(int distance) {
        String result = (swimMax < distance) ? "Слишком большое расстояние для собаки" : String.format("Собака %s проплыла %d м.", name, distance);
        System.out.println(result);
    }
    public void printCountDog() {
        System.out.println("Всего собак " + countDog);
    }
}
