package org.alasgarov.I.bad;

public interface Bird {
    void fly();
    void walk();
}

class Eagle implements Bird{

    @Override
    public void fly() {
        System.out.println("Eagle fly");
    }

    @Override
    public void walk() {

    }
}

class Penguin implements Bird{

    @Override
    public void fly() {
        throw new RuntimeException();
    }

    @Override
    public void walk() {

    }
}