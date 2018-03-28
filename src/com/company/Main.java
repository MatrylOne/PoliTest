package com.company;

public class Main {

    public static void main(String[] args) {
        Number num = new Float(1.2);
        Integer i = new Integer(2);

        A a = new A();
        a.m(i); // A czyli klasę rzutuje integera na Number

        B b = new B();
        b.m(num); // A czyli podając mu number zamiast integera wykonuje się metoda z klasy A
        b.m(i); // B czyli podając mu to co chce, wykonuje się właściwa metoda z klasy B

        a = b; // teraz obiekt klasy b jest przypisywany do deklaracji kasy A
        a.m(num); // A
        a.m(i); // A. W obu przypadkach zachowuje się już jak klasa A
    }
}
