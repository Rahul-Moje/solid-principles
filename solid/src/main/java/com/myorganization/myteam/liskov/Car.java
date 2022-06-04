package com.myorganization.myteam.liskov;

public class Car {

    private Engine engine;

    public void runEngine() {

    }
}

class Engine {
    //engine related methods
}

class MotorCar extends Car {

}

class ElectricCar extends Car {
    //this is wrong because now runEngine would be accessible to electric guitar
}
