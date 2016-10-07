package com.github.Karina_Denisevich.task2.utils;

import com.github.Karina_Denisevich.task2.Stationery;

import java.util.List;

public class StationeryUtil {

    public static double calculateFullPrice(List<Stationery> stationeryList) {
        double result = 0;
        for (Stationery stationery : stationeryList) {
            result += stationery.getPrice();
        }
        return result;
    }
}
