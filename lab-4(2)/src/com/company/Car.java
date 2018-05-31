package com.company;

import org.junit.jupiter.api.Test;

public class Car extends Vehicle implements Navigator<Citizen>{
    Car(Integer capacity) { super(capacity);}
    public void insertPassenger(Citizen passenger) {
    }
    public void ejectPassenger(Citizen passenger) {
    }
}
