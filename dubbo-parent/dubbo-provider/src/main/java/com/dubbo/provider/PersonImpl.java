package com.dubbo.provider;

public class PersonImpl implements  Person {

    @Override
    public String syaHi(String name) {
        return "Hi,"+name;
    }

    @Override
    public String working(String work) {
        return "I am working "+work;
    }
}
