package com.company;

public class Main {

    public static void main(String[] args) {
        Integer wi1 = new Integer(5); // pakowanie
        int i1 = wi1.intValue(); // rozpakowanie
        System.out.println(i1); // 5

        // W javie 9 nie działa. Błąd kompilacji
        Integer wi2 = 5; // automatyczne pakowanie
        int i2 = wi2; // automatyczne rozpakowywanie
    }
}
