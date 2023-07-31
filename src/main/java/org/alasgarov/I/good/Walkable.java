package org.alasgarov.I.good;

public interface Walkable {
    void walk();
}

interface Flyable {
    void fly();
}

class Eagle implements Flyable, Walkable{
    @Override
    public void fly() {}
    @Override
    public void walk() {}
}

class Penguin implements Walkable{
    @Override
    public void walk() {}
}