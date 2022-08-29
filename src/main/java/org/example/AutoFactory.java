package org.example;

import org.example.cars.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AutoFactory {
    private int productionSize;
    private  int carsBuilt;
    private ProductionLine productionLine;
    private DeliverChecker deliverChecker;

    @Autowired
    public AutoFactory(@Qualifier("sedanPL") ProductionLine productionLine, DeliverChecker deliverChecker) {

        carsBuilt = 0;
        this.productionLine = productionLine;
        this.deliverChecker = deliverChecker;
    }

    public void runProduction(){

        while (carsBuilt < productionSize) {
            Car newCar = productionLine.Work();
            if (deliverChecker.CheckDeliver(newCar)) {
                carsBuilt++;
            }
        }
    }

    public void setProductionSize(int productionSize) {
        this.productionSize = productionSize;
    }

    public int getCarsBuilt() {
        return carsBuilt;
    }
}
