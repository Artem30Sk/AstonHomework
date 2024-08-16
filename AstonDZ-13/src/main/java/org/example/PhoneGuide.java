package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneGuide {
    private int id = 0;
    HashMap<Integer, String[]> note = new HashMap<>();
    public void addContact(String name, String contact) {
        String[] array = {name, contact};
        note.put(id+=1, array);
    }
    public void getContact(String name) {
        for (Map.Entry<Integer, String[]> entry: note.entrySet()) {
            String[] value = entry.getValue();
            if(value[0].equals(name)) {
                System.out.println(value[0] + " " + value[1]);
            }
        }
    }
}
