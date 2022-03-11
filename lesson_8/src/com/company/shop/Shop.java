package com.company.shop;

import com.company.shop.exception.ProductNotFoundException;

import java.util.List;

public class Shop implements IBuyer, ISeller {

    private String name;
    private List<ProductAtShop> products;
    private List<User> sellers;

    public Shop(String name, List<ProductAtShop> products) {
        this.name = name;
        this.products = products;
    }

    @Override
    public Product buy(long id) throws ProductNotFoundException {
        for (ProductAtShop product : products) {
            if (product.compare(id)) {
                product.buy();
                if (product.getCount() == 0) {
                    products.remove(product);
                }
                return product;
            }
        }
        throw new ProductNotFoundException("Продукт не был найден");
    }

    @Override
    public void getInfo(String name) {
        for (Product product : products) {
            if (product.containInName(name)) {
                System.out.println(product);
            }
        }
    }

    public String getName() {
        return name;
    }

    public List<ProductAtShop> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }

    @Override
    public void add(Product product) {
        for(Product prd : products){
            if(prd.compare(product.getName())){

            }
        }
    }

    @Override
    public ProductAtShop getInfo(long id) {
        for(ProductAtShop product : products){
            if(product.getId() == id){
                return product;
            }
        }
        throw new ProductNotFoundException("not found product");
    }

    @Override
    public ProductAtShop updateProduct(long id, ProductAtShop product) {
        return null;
    }
}
