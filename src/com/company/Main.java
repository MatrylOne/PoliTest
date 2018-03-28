package com.company;

public class Main {

    public static void main(String[] args) {
        Number num = new Float(1.2);
        Integer i = new Integer(2);

        A a = new A();
        a.m(i); // A. Dostał to czego chciał. Normal

        B b = new B();
        b.m(num); // B. Dostał to czego chciał. Normal
        b.m(i); // A. Dostał to czego chciał wyżyszy obiekt.

        a = b;
        //a.m(num); // błąd kompilacji a.m(i); InteliJ podkreśla. Dostał wyższy obiekt. Nie wiedział co zrobić. Nie mógł rzutować
    }
}
