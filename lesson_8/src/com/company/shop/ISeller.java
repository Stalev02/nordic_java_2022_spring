package com.company.shop;

public interface ISeller {
    void add(Product product);

    ProductAtShop getInfo(long id);

    ProductAtShop updateProduct(long id, ProductAtShop product);
}
