package com.company;

public class Main {

    public static void main(String[] args) {
        A a = new B();
        B b = new B();

        a.m(a); // A.m(A)
        a.m(b); // A.m(A)
        b.m(a); // A.m(A)
        b.m(b); // B.m(B)
    }
}
