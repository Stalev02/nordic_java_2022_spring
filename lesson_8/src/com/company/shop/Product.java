package com.company.shop;

public class Product {
    private String name;
    private double weight;
    private ProductTypeEnum type;

    public Product(String name, double weight, ProductTypeEnum type) {
        this.name = name;
        this.weight = weight;
        this.type = type;
    }

    public boolean containInName(String name){
        return this.name.contains(name);
    }



    public double getWeight() {
        return weight;
    }

    public ProductTypeEnum getType() {
        return type;
    }

    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return "Product{ " +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", type=" + type +
                " }";
    }
}
