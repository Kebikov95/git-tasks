package collections.main.autopark;

import collections.main.autopark.types.BrandType;

import java.util.Objects;

public abstract class Car {
    // Fuel consumption is indicated as the consumption of liters of gasoline per 100 km.
    // Cost is indicated as the quantity of dollars per unit.
    private BrandType brand;
    private String model;
    private double fuelConsumption;
    private double cost;
    private int quantityOfPassengerSeats;
    private int productionYear;
    private int maxSpeed;

    public Car(BrandType brand, String model, double fuelConsumption, double cost, int quantityOfPassengerSeats, int productionYear, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.cost = cost;
        this.quantityOfPassengerSeats = quantityOfPassengerSeats;
        this.productionYear = productionYear;
        this.maxSpeed = maxSpeed;
    }

    public BrandType getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getCost() {
        return cost;
    }

    public int getQuantityOfPassengerSeats() {
        return quantityOfPassengerSeats;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int getMaxSpeed() { return maxSpeed; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.fuelConsumption, fuelConsumption) == 0 &&
                productionYear == car.productionYear &&
                maxSpeed == car.maxSpeed &&
                brand == car.brand &&
                Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, fuelConsumption, cost, quantityOfPassengerSeats, productionYear, maxSpeed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", model='" + model + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", cost=" + cost +
                ", quantityOfPassengerSeats=" + quantityOfPassengerSeats +
                ", productionYear=" + productionYear +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}