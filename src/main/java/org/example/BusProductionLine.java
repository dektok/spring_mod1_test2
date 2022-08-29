package org.example;

import org.example.cars.Car;
import org.springframework.stereotype.Component;

@Component
public class BusProductionLine implements ProductionLine {
    public Car Work() {
        return new Car(true);
    }
}
