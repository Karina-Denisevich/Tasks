package com.github.Karina_Denisevich.task3_4.stationery;

public class Envelope extends PaperProduct {

    private Double height;

    public Envelope(String name, Double price, Double height) {
        this.name = name;
        this.price = price;
        this.height = height;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
