package com.company;

public class Main {

    public static void main(String[] args) {
        A a = new A();

        Number n = a.m();
        System.out.println(n);
        // Prints 3.14

        a = new B();
        n = a.m();
        System.out.println(n);
        // Prints 5.0
    }
}
