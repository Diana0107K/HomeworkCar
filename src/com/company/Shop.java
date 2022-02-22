package com.company;

public class Shop {
    private final Factory factory;
    private final Service service;

    public Shop(Factory factory, Service service) {
        this.factory = factory;
        this.service = service;
    }
}
