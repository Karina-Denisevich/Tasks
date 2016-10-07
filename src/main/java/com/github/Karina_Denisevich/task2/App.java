package com.github.Karina_Denisevich.task2;

import com.github.Karina_Denisevich.task2.utils.StationeryUtil;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Stationery stationeryFolder = new Stationery(Stationery.TypeEnum.FOLDER, 30.0);
        Stationery stationeryNotebook = new Stationery(Stationery.TypeEnum.NOTEBOOK, 20.0);

        List<Stationery> stationeryList = new ArrayList<>();
        stationeryList.add(stationeryFolder);
        stationeryList.add(stationeryNotebook);

        Employee employee1 = new Employee("Mark");
        employee1.setStationeryList(stationeryList);

        System.out.println(StationeryUtil.calculateFullPrice(employee1.getStationeryList()));
    }
}
