package com.poc.model;

import java.math.BigDecimal;

public class Item {
    private String name;
    private BigDecimal price;
    private String category;

    public Item(String name, double price, String category) {
        this.name = name;
        this.price = new BigDecimal(price).setScale(2, BigDecimal.ROUND_FLOOR);
        this.category = category;
    }

    public enum CategoryType {
        FOOD,
        DRINK
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
