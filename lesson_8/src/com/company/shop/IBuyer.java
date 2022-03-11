package com.company.shop;

public interface IBuyer {

    Product buy( String name) throws ClassNotFoundException;

    void getInfo(String name);
}
