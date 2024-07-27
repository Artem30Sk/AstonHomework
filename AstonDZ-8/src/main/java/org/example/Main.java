package org.example;

public class Main {
    static Person[] person = new Person[5];
    public static void main(String[] args) {
        //launchClassEmployee();
        //fillArray();
        //launchclassPark();
    }
    //Задание-1
    public static void launchClassEmployee(){
        Employee employee1 = new Employee();
        employee1.printInfo();
    }
    //Задание-2
    public static void fillArray(){
        person[0] = new Person("Егор","Филатов","egorfil@gmainl.com",2223311,30000,26);
        person[1] = new Person("игорь","Тютюнников","igortt@gmainl.com",4442211,60000,26);
        person[2] = new Person("Елена","Мартышкина","elmartish@gmainl.com",1116665,21000,52);
        person[3] = new Person("Олег","Борода","boroleg@gmainl.com",7778811,15000,32);
        person[4] = new Person("Кирилл","Сысоев","siskir@gmainl.com",9999898,45999,44);

    }
    //Задание-3
    public static void launchclassPark(){
        Park.Attractions parkatr = new Park().new Attractions("Колесо обозрения","9:00-11:00",100);
        System.out.println(parkatr.name + " " + parkatr.timework + " " + parkatr.cost);
    }
}