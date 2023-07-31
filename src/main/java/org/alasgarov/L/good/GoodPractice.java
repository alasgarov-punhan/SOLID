package org.alasgarov.L.good;

public class GoodPractice {




}

abstract class Bird{
    void walk(){
        //code
    }
}

abstract class FlyingBirds extends Bird{
    void fly() {
        //code
    }
}

class Penguin extends Bird{
    void walk(){
        //code
    }
}

class Duck extends FlyingBirds{
    void fly() {
        //code
    }
    void walk(){
        //code
    }
}

