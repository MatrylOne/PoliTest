package com.company;

public class Main {
    public static void main(String[] args) {
        PairHomo<?>[] t = new PairHomo<?>[5];

        t[0] = new PairHomo<Integer>(5, 5);
        t[1] = new PairHomo<Float>(2.2f, 3.5f);
        System.out.println(t[0]);
        System.out.println(t[1]);

    }
}
