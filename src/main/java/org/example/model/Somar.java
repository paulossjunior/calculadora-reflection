package org.example.model;

public class Somar implements  IOperation{
    @Override
    public int calc(int a, int b) {
        return a + b;
    }
}
