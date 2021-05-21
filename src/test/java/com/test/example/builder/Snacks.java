package com.test.example.builder;

public abstract class Snacks implements Item{

    @Override
    public abstract float price();

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
