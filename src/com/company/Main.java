package com.company;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> p = new Pair<>("Five", 5);
        String s = p.getFst();
        Integer numberInt = p.getSnd();
        Number numberNum = p.getSnd();

        System.out.println(numberInt);
        System.out.println(numberNum);
    }
}
