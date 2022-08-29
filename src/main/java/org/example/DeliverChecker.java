package org.example;

import org.example.cars.Car;
import org.springframework.stereotype.Component;

@Component
public class DeliverChecker {

    public boolean CheckDeliver(Car car) {
        return car.getPartsDelivered();
    }
}
