package com.company;

public class Pair<A, B> {
    protected A e1;
    protected B e2;

    public Pair(A e1, B e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public A getFst() {
        return e1;
    }

    public B getSnd() {
        return e2;
    }

    public String toString() {
        return "(" + e1 + ", " + e2 + ")";
    }
}