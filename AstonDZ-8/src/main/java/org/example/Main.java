package org.example;

public class Main {
    static Person[] person = new Person[5];
    public static void main(String[] args){
        launchClassEmployee();
        //fillArray();
        //launchClassPark();
    }
    public static void launchClassEmployee(){
        Employee employee = new Employee("Кирилл", "Самойлов", "kirsam@mail.ru", 3921090, 34000, 23);
        employee.printInfo();
    }
    public static void fillArray(){
        person[0] = new Person("Егор","Филатов","egorfil@gmainl.com",2223311,30000,26);
        person[1] = new Person("игорь","Тютюнников","igortt@gmainl.com",4442211,60000,26);
        person[2] = new Person("Елена","Мартышкина","elmartish@gmainl.com",1116665,21000,52);
        person[3] = new Person("Олег","Борода","boroleg@gmainl.com",7778811,15000,32);
        person[4] = new Person("Кирилл","Сысоев","siskir@gmainl.com",9999898,45999,44);
    }
    public static void launchClassPark(){
        Park.Attractions parkAtr = new Park().new Attractions("Колесо обозрения","9:00-11:00",100);
        System.out.println(parkAtr.name + " " + parkAtr.timeWork + " " + parkAtr.cost);
    }
}