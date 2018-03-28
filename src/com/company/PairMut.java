package com.company;

public class PairMut<A, B> extends Pair<A, B> {
    public PairMut(A e1, B e2) {
        super(e1, e2);
    }

    public void setFst(A e) {
        e1 = e;
    }

    public void setSnd(B e) {
        e2 = e;
    }
}
