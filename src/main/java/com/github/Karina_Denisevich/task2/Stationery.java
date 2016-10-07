package com.github.Karina_Denisevich.task2;

public class Stationery {

    public enum TypeEnum {
        PAPER,
        PEN,
        NOTEBOOK,
        FOLDER;
    }

    private TypeEnum type;
    private Double price;

    public Stationery(TypeEnum name, Double price) {
        this.type = name;
        this.price = price;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
