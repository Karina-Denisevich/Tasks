package com.github.Karina_Denisevich.task3_4.utils;

import java.util.List;

public class IOUtil {

    public void writeList(String message, List<?> stationeryList) {
        System.out.println(message);
        stationeryList.forEach(System.out::println);
    }
}
