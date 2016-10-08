package com.github.Karina_Denisevich.task3_4.stationery;

public abstract class Stationery implements Comparable<Stationery> {

    protected Double price;
    protected String name;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // compare by name and price, price is more priority
    @Override
    public int compareTo(Stationery stationery) {
        if (this.price.equals(stationery.price)) {
            return this.name.compareTo(stationery.name);
        } else {
            return this.price.compareTo(stationery.price);
        }
    }

    @Override
    public String toString() {
        return "Stationery{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
