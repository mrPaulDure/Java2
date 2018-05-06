package ru.geekbrains;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] sArr = new String[10];
        sArr[0] = "abc";
        sArr[1] = "abbbb";
        sArr[2] = "abbbb";
        sArr[3] = "abc";
        sArr[4] = "acccc";
        sArr[5] = "abc";
        sArr[6] = "abc";
        sArr[7] = "acccc";
        sArr[8] = "acccc";
        sArr[9] = "afda";
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> counter = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < sArr.length; i++) {
            list.add(sArr[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j)) && i != j) {
                    list.remove(j);
                    j--;
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < sArr.length; j++) {
                if (list.get(i).equals(sArr[j])) {
                    count++;
                }
            }
            counter.add(count);
            count = 0;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " - " + counter.get(i));
        }

        /////////////Part two/////////////////

        Phonebook p = new Phonebook();
        p.add("Bob", "+1231231");
        p.add("Bob", "+121231");
        p.add("Sam", "+155551");
        p.add("Lulu", "+164231");

        System.out.println(p.get("Bob"));
    }
}
