package org.example;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
     static String[] array = {
            "Стол", "Стул", "Чемодан", "Кровать", "Шкаф",
            "Стеллаж", "Стол", "Подушка", "Подушка", "Тумбочка",
            "Посудомойка", "Печка", "Холодильник", "Кровать", "Лампочка",
            "Стакан", "Дверь", "Окно", "Морозильник", "Люстра",
            "Кружка", "Кружка", "Дверца", "Обои", "Батарея",
    };

    public static void main(String[] args) {
       ActionWithArray actionWithArray = new ActionWithArray();
       PhoneGuide phoneGuide = new PhoneGuide();
        actionWithArray.countWordInArray(array);
        phoneGuide.addContact("Олег", "79193224455");
        phoneGuide.addContact("Семен", "79193224422");
        phoneGuide.addContact("Виталий", "79213223434");
        phoneGuide.addContact("Олег", "79193227575");
        phoneGuide.addContact("Кирилл", "79193227722");
        phoneGuide.addContact("Данила", "79193221155");
        phoneGuide.addContact("Олег", "79193223434");
        phoneGuide.getContact("Олег");
    }
}