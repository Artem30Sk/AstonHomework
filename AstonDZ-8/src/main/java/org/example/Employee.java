package org.example;


//Задание-1
public class Employee {
    private String name;
    private String lastname;
    private String post;
    private int phone;
    private int salary;
    private int age;
    public Employee(){
        name = "Олег";
        lastname = "Белый";
        post = "Стажер";
        phone = 2223311;
        salary=30000;
        age = 25;
    }
    public void printInfo(){
        Employee main = new Employee();
        System.out.println(main.name + " " + main.lastname + " " + main.post + " " + main.phone + " " + main.salary + " " + main.age);
    }

}
