package com.company;

public class Main {

    public static void go(Long n){
        System.out.println("takes Long ");
    }

    public static void go(Short n){
        System.out.println("takes Short ");
    }

    public static void go(int n){
        System.out.println("takes int ");
    }

    public static void main(String[] args) {
        short y = 6; // short a nie Short!
        long z = 7; // long a nie Long!

        go(y); // int
        go(z); // Long
        go((Short)y); // Short
    }
}
