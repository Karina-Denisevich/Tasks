package com.github.Karina_Denisevich.task3_4.stationery;

public class Clip extends Stationery {

    private Double weight;

    public Clip(String name, Double price, Double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
