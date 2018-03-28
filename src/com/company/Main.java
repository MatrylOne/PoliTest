package com.company;

public class Main {

    public static void main(String[] args) {
        Integer[] arrInt = {new Integer(1), new Integer(2)};
        arrInt[0] = new Integer(3);
        //arrInt[1] = new Float(3.14); // błąd w InteliJ

        Number[] arrNum = arrInt;
        System.out.println(arrNum[0]);
        arrNum[0] = new Integer(3);
        //arrNum[1] = new Float(3.14); // ArrayStoreException
    }
}
