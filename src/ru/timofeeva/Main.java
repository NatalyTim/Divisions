package ru.timofeeva;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String[] a = {"K1\\SK1", "K1\\SK2", "K1\\SK1\\SSK1", "K1\\SK1\\SSK2", "K2", "K2\\SK1\\SSK1", "K2\\SK1\\SSK2"};
        Divisions d = new Divisions();
        d.parseArray(a);
        System.out.println(d.divisionSet);
        for (Object f : d.divisionSet) {
            System.out.println(f);
        }
    }
}
