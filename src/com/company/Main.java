package com.company;

public class Main {
    public static void main(String[] args) {
        A a = new A(10);
        //A a = new <Integer>A(10);
        System.out.println(a.doubleIt(5.0f));
        a.<Integer>foo(3);
        System.out.println(a.val);

    }
}
