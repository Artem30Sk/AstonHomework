package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int foodBowl = 15;
    public static void main(String[] args) {
        Animal animFirst = new Animal("Вилуп");
        Cat catFirst = new Cat("Серый",15);
        Cat catSec = new Cat("Черный",5);
        Dog dogFirst = new Dog("Левый");
        Dog dogSec = new Dog("Правый");

        animFirst.printCountAnimal();
        catFirst.printCountCat();
        dogFirst.printCountDog();

        catFirst.run(190);
        catFirst.run(210);
        catFirst.swim(15);
        dogFirst.run(450);
        dogFirst.run(550);
        dogFirst.swim(5);

        eatMealOneCat(catFirst);
        printCatSatietyState(catFirst);
        eatMealOneCat(catSec);
        printCatSatietyState(catSec);

        addMealInFoodBowl(30);

        Cat[] catArray = new Cat[3];
        catArray[0] = new Cat("Барсик",5);
        catArray[1] = new Cat("Мурзик",20);
        catArray[2] = new Cat("Бандит",10);
        eatMealSomeCat(catArray);

    }
    public static void eatMealSomeCat(Cat[] cat) {
        for (Cat value : cat) {
            if (value.mealMinimum > foodBowl) {
                System.out.println("В миске не хватает еды для кота " + value.name);
            }
            else {
                System.out.println("Кот " + value.name + " поел");
                foodBowl -= value.mealMinimum;
                value.satiety = true;
            }
            String catSatietyState = (!value.satiety) ? "Кот " + value.name + " голоден" : "Кот " + value.name + " сыт";
            System.out.println(catSatietyState);
        }
    }
    public static void eatMealOneCat(Cat cat) {
        if (cat.mealMinimum>foodBowl) {
            System.out.println("В миске не хватает еды для кота " + cat.name);
        }
        else {
            System.out.println("Кот " + cat.name + " поел");
            foodBowl -= cat.mealMinimum;
            cat.satiety = true;
        }
    }
    public static void printCatSatietyState(Cat cat) {
        String catSatietyState = (!cat.satiety) ? "Кот " + cat.name + " голоден" : "Кот " + cat.name + " сыт";
        System.out.println(catSatietyState);
    }
    public static void addMealInFoodBowl(int meal) {
        foodBowl+=meal;
    }
}