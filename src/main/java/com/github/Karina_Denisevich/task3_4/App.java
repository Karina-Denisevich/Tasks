package com.github.Karina_Denisevich.task3_4;

import com.github.Karina_Denisevich.task3_4.stationery.Envelope;
import com.github.Karina_Denisevich.task3_4.stationery.Notebook;
import com.github.Karina_Denisevich.task3_4.stationery.Stationery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Stationery> stationeryList = new ArrayList<>();

        Notebook notebook = new Notebook("HelloKitty", 3.0, 100);
        Notebook notebook1 = new Notebook("AelloKitty", 3.0, 200);
        Envelope envelope = new Envelope("ZZZ", 10.0, 20.0);
        Envelope envelope1 = new Envelope("AAA", 15.0, 15.0);

        stationeryList.add(notebook);
        stationeryList.add(notebook1);
        stationeryList.add(envelope);
        stationeryList.add(envelope1);

        System.out.println("Stationery list :");
        stationeryList.forEach(System.out::println);

        Collections.sort(stationeryList);
        System.out.println("\nAfter sorting by price and name :");
        stationeryList.forEach(System.out::println);
    }
}
