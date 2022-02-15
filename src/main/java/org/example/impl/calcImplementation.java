package org.example.impl;

import org.example.api.calcService;

public class calcImplementation implements calcService{

    @Override
    public int add(int x, int y) {
        return x+y;
    }

    @Override
    public int subtract(int x, int y) {
        return x-y;
    }

    @Override
    public int multiply(int x, int y) {
        return x*y;
    }

    @Override
    public int divide(int x, int y) {
        if(x%y==0)
            return x/y;
        else
            return -1;
    }
}
