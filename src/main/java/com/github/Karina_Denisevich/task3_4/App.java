package com.github.Karina_Denisevich.task3_4;

import com.github.Karina_Denisevich.task3_4.stationery.Envelope;
import com.github.Karina_Denisevich.task3_4.stationery.Notebook;
import com.github.Karina_Denisevich.task3_4.stationery.Stationery;
import com.github.Karina_Denisevich.task3_4.utils.BeginnerKit;
import com.github.Karina_Denisevich.task3_4.utils.IOUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {

    public static void main(String[] args) {
        IOUtil ioUtil = new IOUtil();
        List<Stationery> stationeryList = new BeginnerKit().getSomeBeginnerKit();

        ioUtil.writeList("Stationery list :", stationeryList);

        List<Stationery> stationeryListCopy = new ArrayList<>(stationeryList);
        Collections.sort(stationeryListCopy);
        ioUtil.writeList("\nAfter sorting by price and name :", stationeryListCopy);

        stationeryListCopy = new ArrayList<>(stationeryList);
        stationeryListCopy.sort((o1, o2) -> o1.getPrice().compareTo(o2.getPrice()));
        ioUtil.writeList("\nAfter sorting by price :", stationeryListCopy);

        stationeryListCopy = new ArrayList<>(stationeryList);
        stationeryListCopy.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        ioUtil.writeList("\nAfter sorting by name :", stationeryListCopy);
    }
}
