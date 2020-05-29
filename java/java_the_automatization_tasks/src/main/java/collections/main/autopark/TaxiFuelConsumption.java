package collections.main.autopark;

import java.util.Comparator;

public class TaxiFuelConsumption implements Comparator<Taxi> {

    @Override
    public int compare(Taxi taxi1, Taxi taxi2) {
        int result = 0;
        if(taxi1.getFuelConsumption() > taxi2.getFuelConsumption()){
            result = 1;
        } else {
            result = -1;
        }
        return result;
    }
}
