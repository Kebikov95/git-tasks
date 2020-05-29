package collections.main.autopark.models;

import collections.main.autopark.Car;
import collections.main.autopark.interfaces.HaveAmusement;
import collections.main.autopark.types.BrandType;

public class Limousine extends Car implements HaveAmusement {
    public Limousine(BrandType brand, String model, double fuelConsumption, double cost, int quantityOfPassengerSeats, int productionYear, int maxSpeed) {
        super(brand, model, fuelConsumption, cost, quantityOfPassengerSeats, productionYear, maxSpeed);
    }

    @Override
    public void turnOnTV() {
        System.out.println("TV is on.");
    }

    @Override
    public void turnOffTV() {
        System.out.println("TV is off.");
    }

    @Override
    public void turnOnMediaSystem() {
        System.out.println("The media system is on.");
    }

    @Override
    public void turnMediaSystem() {
        System.out.println("The media system is off.");
    }
}
