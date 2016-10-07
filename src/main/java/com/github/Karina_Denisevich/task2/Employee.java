package com.github.Karina_Denisevich.task2;

import java.util.List;

public class Employee {

    private List<Stationery> stationeryList;

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public List<Stationery> getStationeryList() {
        return stationeryList;
    }

    public void setStationeryList(List<Stationery> stationeryList) {
        this.stationeryList = stationeryList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
