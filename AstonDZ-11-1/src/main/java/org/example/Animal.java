package org.example;

public class Animal {
    public String name;
    public static int countAnimal = 0;

    { countAnimal+=1; }
    public Animal(String name){
        this.name = name;
    }
    public void run(int distance){
        System.out.println("Животное: " + name + " пробежало " + distance + " м.");
    }
    public void swim(int distance){
        System.out.println("Животное: " + name + " проплыло " + distance + " м.");
    }
    public void printCountAnimal(){
        System.out.println("Всего животных " + countAnimal);
    }
}
