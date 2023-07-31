package org.alasgarov.L;

public class BadPractice {

}

abstract class Bird{
    void fly() {
        //code
    }
    void walk(){
        //code
    }
}

class Penguin extends Bird{
    @Override
    void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly");
    }

    @Override
    void walk() {
        super.walk();
    }
}

class Duck extends Bird{
    @Override
    void fly() {
        super.fly();
    }
    @Override
    void walk() {
        super.walk();
    }
}

