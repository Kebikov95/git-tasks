package collections.main.autopark;

import collections.main.autopark.types.BrandType;
import collections.main.autopark.types.RideType;

public class Taxi extends Car {
    private String registrationNumber;
    private RideType rideType;

    public Taxi(BrandType brand, String model, double fuelConsumption, double cost, int quantityOfPassengerSeats, int productionYear, int maxSpeed, String registrationNumber, RideType rideType) {
        super(brand, model, fuelConsumption, cost, quantityOfPassengerSeats, productionYear, maxSpeed);
        this.registrationNumber = registrationNumber;
        this.rideType = rideType;
    }

    public Taxi(Car car, String registrationNumber, RideType rideType) {
        super(car.getBrand(), car.getModel(), car.getFuelConsumption(), car.getCost(), car.getQuantityOfPassengerSeats(), car.getProductionYear(), car.getMaxSpeed());
        this.registrationNumber = registrationNumber;
        this.rideType = rideType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public RideType getRideType() {
        return rideType;
    }

    @Override
    public String toString() {
        return "\nTaxi{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", rideType=" + rideType + ", "
                + super.toString() + "}";
    }
}
