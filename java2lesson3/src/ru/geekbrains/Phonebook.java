package ru.geekbrains;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private HashMap<String, String> phonebook = new HashMap<>();

    public ArrayList<String> get(String name) {
        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String, String> pair : this.phonebook.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            if (value.equals(name)) {
                list.add(name + ": " + key);
            }
        }
        return list;
    }

    public void add(String name, String phoneNum) {
        this.phonebook.put(phoneNum, name);
    }
}
