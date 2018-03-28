package com.company;

class B extends A {
    public void m(B other) {
        System.out.print("B.m(B) ");
    } // parametr będący podtypem
}