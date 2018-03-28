package com.company;

class A {
    public double val;

    <T extends Number> A(T arg) {
        val = arg.doubleValue();
    }

    static <T extends Number> double doubleIt(T arg) {
        return 2.0 * arg.doubleValue();
    }

    <T extends Number> void foo(T arg) {
        val = arg.doubleValue();
    }
}