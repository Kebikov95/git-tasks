package collections.main.autopark.models;

import collections.main.autopark.Car;
import collections.main.autopark.interfaces.GetThreeDoors;
import collections.main.autopark.types.BrandType;

public class Hatchback extends Car implements GetThreeDoors {

    public Hatchback(BrandType brand, String model, double fuelConsumption, double cost, int quantityOfPassengerSeats, int productionYear, int maxSpeed) {
        super(brand, model, fuelConsumption, cost, quantityOfPassengerSeats, productionYear, maxSpeed);
    }

    @Override
    public void displayQuantityOfDoors() {
        System.out.println("The quantity of doors is " + quantityOfDoors + ".");
    }
}
