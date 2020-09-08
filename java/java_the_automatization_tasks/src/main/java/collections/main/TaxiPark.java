package collections.main.autopark;

import java.util.ArrayList;
import java.util.List;

public class TaxiPark {
    private final List<Taxi> taxis;

    public TaxiPark(List<Taxi> taxis) {
        this.taxis = taxis;
    }

    public double getCost() {
        double cost = 0;
        for (Taxi taxi : taxis) {
            cost += taxi.getCost();
        }
        return cost;
    }

    public List<Taxi> sortTaxiByFuelConsumption() {
        taxis.sort(new TaxiFuelConsumption());
        return taxis;
    }

    public List<Taxi> findTaxiBySpeedRange(int minSpeedRange, int maxSpeedRange) {
        List<Taxi> findTaxisBySpeedRange = new ArrayList<>();
        for (Taxi taxi : taxis) {
            if (taxi.getMaxSpeed() > minSpeedRange &&
                    taxi.getMaxSpeed() < maxSpeedRange) {
                findTaxisBySpeedRange.add(taxi);
            }
        }
        return findTaxisBySpeedRange;
    }
}
