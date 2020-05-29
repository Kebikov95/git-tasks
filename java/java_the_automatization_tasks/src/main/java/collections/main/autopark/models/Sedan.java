package collections.main.autopark.models;

import collections.main.autopark.Car;
import collections.main.autopark.interfaces.HaveSpareTire;
import collections.main.autopark.types.BrandType;

public class Sedan extends Car implements HaveSpareTire {

    public Sedan(BrandType brand, String model, double fuelConsumption, double cost, int quantityOfPassengerSeats, int productionYear, int maxSpeed) {
        super(brand, model, fuelConsumption, cost, quantityOfPassengerSeats, productionYear, maxSpeed);
    }

    @Override
    public void useSpareTire() {
        System.out.println("Spare tire was installed.");
    }
}
