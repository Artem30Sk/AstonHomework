package org.example;


public class Employee {
    private String name;
    private String lastName;
    private String post;
    private int phone;
    private int salary;
    private int age;
    public Employee(String _name, String _lastName, String _post, int _phone, int _salary, int _age) {
        this.name = _name;
        this.lastName = _lastName;
        this.post = _post;
        this.phone = _phone;
        this.salary = _salary;
        this.age = _age;
    }
    public void printInfo() {
        System.out.println(this.name + "  " + this.lastName + "  " + this.post + "  " + this.phone + "  " + this.salary + "  " + this.age);
    }

}
