package com.github.Karina_Denisevich.task3_4.utils;

import com.github.Karina_Denisevich.task3_4.stationery.Clip;
import com.github.Karina_Denisevich.task3_4.stationery.Envelope;
import com.github.Karina_Denisevich.task3_4.stationery.Notebook;
import com.github.Karina_Denisevich.task3_4.stationery.Stationery;

import java.util.ArrayList;
import java.util.List;

public class BeginnerKit {

    public List<Stationery> getSomeBeginnerKit() {
        List<Stationery> stationeryList = new ArrayList<>();

        Notebook notebook = new Notebook("HelloKitty", 3.0, 100);
        Notebook notebook1 = new Notebook("AelloKitty", 3.0, 200);
        Envelope envelope = new Envelope("ZZZ", 10.0, 20.0);
        Envelope envelope1 = new Envelope("AAA", 15.0, 15.0);
        Clip clip = new Clip("Clip", 2.0, 5.0);

        stationeryList.add(notebook);
        stationeryList.add(notebook1);
        stationeryList.add(envelope);
        stationeryList.add(envelope1);
        stationeryList.add(clip);

        return stationeryList;
    }
}
