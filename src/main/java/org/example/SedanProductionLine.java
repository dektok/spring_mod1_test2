package org.example;

import org.example.cars.Car;
import org.springframework.stereotype.Component;

@Component("sedanPL")
public class SedanProductionLine implements ProductionLine{
    public Car Work() {

        boolean partsDelivered = false;
        double rand = Math.random();
        if (rand > .5) partsDelivered = true;

        return new Car(partsDelivered);
    }
}
