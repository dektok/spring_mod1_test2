package org.example.cars;

public class Car {

    boolean partsDelivered;

    public Car(boolean parts){
        this.partsDelivered = parts;

        if (this.partsDelivered) {
            System.out.println("i`m sedan. I was born!");
        } else {
            System.out.println("i`m sedan. No parts delivered!");
        }
    }

    public boolean getPartsDelivered() {
        return partsDelivered;
    }
}
