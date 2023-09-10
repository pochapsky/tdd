package org.example;

import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.TreeBidiMap;

import java.util.Map;

public class Main {
    static BidiMap<String, String> bidi = new TreeBidiMap<>();

    public static void main(String[] args) {

        add("Юля", "7-927-7972163");
        add("Марк", "7-920-2222012");
        add("Никита", "7-925-7732334");
        add("Дэйзи", "7-915-2534348");
        add("Михаил", "7-921-7972163");
        add("Юля", "7-927-7111000");
        printAllNames();
        System.out.println((char) 27 + "[31m " + findByName("Михаил"));
        System.out.println((char) 27 + "[31m" + findByNumber("7-915-2534348"));

    }

    private static int add(String name, String phone) {
        bidi.putIfAbsent(name, phone);
        return bidi.size();
    }

    private static String findByName(String name) {

        return bidi.get(name);
    }

    private static String findByNumber(String phone) {

        return bidi.getKey(phone);
    }

    private static void printAllNames() {

        System.out.println("Телефонный справочник: ");
        for (Map.Entry<String, String> k : bidi.entrySet()) {
            System.out.printf((char) 27 + "[34m " + "%-15s %15s %n", k.getKey(), (char) 27 + "[32m " + k.getValue());
        }
    }


}