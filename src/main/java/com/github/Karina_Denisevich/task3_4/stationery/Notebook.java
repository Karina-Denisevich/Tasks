package com.github.Karina_Denisevich.task3_4.stationery;

public class Notebook extends PaperProduct {

    private Integer pagesAmount;

    public Notebook(String name, Double price, Integer pagesAmount) {
        this.name = name;
        this.price = price;
        this.pagesAmount = pagesAmount;
    }

    public Integer getPagesAmount() {
        return pagesAmount;
    }

    public void setPagesAmount(Integer pagesAmount) {
        this.pagesAmount = pagesAmount;
    }
}
