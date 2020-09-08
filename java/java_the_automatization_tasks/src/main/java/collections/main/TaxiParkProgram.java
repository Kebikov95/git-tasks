package collections.main.autopark;

import collections.main.autopark.Taxi;
import collections.main.autopark.TaxiPark;
import collections.main.autopark.models.Hatchback;
import collections.main.autopark.models.Limousine;
import collections.main.autopark.models.Sedan;
import collections.main.autopark.types.BrandType;
import collections.main.autopark.types.RideType;

import java.util.Arrays;
import java.util.List;

public class TaxiParkProgram {
    static List<Taxi> taxis = Arrays.asList(
            new Taxi(new Hatchback(BrandType.VOLKSWAGEN, "Polo", 5.8, 13800.4, 4, 2018, 178), "9301-AB-7", RideType.COMFORT),
            new Taxi(new Hatchback(BrandType.RENO, "Sandero", 7.8, 9800.4, 4, 2018, 178), "8313-AB-7", RideType.COMFORT),
            new Taxi(new Hatchback(BrandType.RENO, "Sandero", 6.8, 10300.72, 4, 2020, 198), "5414-IB-7", RideType.COMFORT),
            new Taxi(new Hatchback(BrandType.NISSAN, "Note", 7.3, 11540.9, 4, 2017, 201), "5213-AB-3", RideType.COMFORT),
            new Taxi(new Sedan(BrandType.VOLKSWAGEN, "Polo", 7.5, 10100.4, 4, 2019, 183), "2413-AK-7", RideType.COMFORT),
            new Taxi(new Sedan(BrandType.VOLKSWAGEN, "Polo", 7.2, 10800.9, 4, 2018, 201), "9113-RK-7", RideType.COMFORT),
            new Taxi(new Sedan(BrandType.RENO, "Logan", 8.2, 9500.4, 4, 2019, 173), "8273-AB-7", RideType.COMFORT),
            new Taxi(new Sedan(BrandType.RENO, "Logan", 8.2, 9500.4, 4, 2019, 173), "4030-AB-7", RideType.COMFORT),
            new Taxi(new Sedan(BrandType.VOLKSWAGEN, "Polo", 7.5, 10100.4, 4, 2019, 183), "2312-AK-7", RideType.COMFORT),
            new Taxi(new Sedan(BrandType.VOLKSWAGEN, "Polo", 7.2, 10800.9, 4, 2018, 201), "7412-RK-7", RideType.COMFORT),
            new Taxi(new Sedan(BrandType.RENO, "Logan", 8.2, 9500.4, 4, 2019, 173), "4018-AB-7", RideType.COMFORT),
            new Taxi(new Sedan(BrandType.RENO, "Logan", 8.2, 9500.4, 4, 2019, 173), "0930-AB-7", RideType.COMFORT),
            new Taxi(new Sedan(BrandType.AUDI, "A7", 7.2, 49500.4, 4, 2019, 292), "0009-AB-7", RideType.BUSINESS),
            new Taxi(new Sedan(BrandType.AUDI, "A5", 7.4, 33500.4, 4, 2019, 273), "0032-AB-7", RideType.BUSINESS),
            new Taxi(new Sedan(BrandType.AUDI, "A5", 7.4, 33500.4, 4, 2019, 273), "0030-AB-7", RideType.BUSINESS),
            new Taxi(new Sedan(BrandType.AUDI, "A5", 7.4, 33500.4, 4, 2019, 273), "0333-AB-7", RideType.BUSINESS),
            new Taxi(new Sedan(BrandType.AUDI, "A5", 7.4, 33500.4, 4, 2019, 273), "0123-AB-7", RideType.BUSINESS),
            new Taxi(new Limousine(BrandType.MERCEDES, "Mercedes-Maybach S600", 14.4, 73500.4, 4, 2015, 233), "0000-AB-7", RideType.VIP),
            new Taxi(new Limousine(BrandType.MERCEDES, "Mercedes-Maybach S600", 16.3, 78502.4, 4, 2016, 233), "7777-AB-7", RideType.VIP)
    );

    public static void main(String[] args) {
        TaxiPark taxiPark = new TaxiPark(taxis);
        List<Taxi> findTaxisBySpeedRange = taxiPark.findTaxiBySpeedRange(170, 180);
        System.out.println("\nDisplay all available taxis in taxi park:" + taxis);
        System.out.printf("\nThe cost of the entire taxi park is %.2f$.\n", taxiPark.getCost());
        System.out.println("\nSorted taxis by fuel consumption:" + taxiPark.sortTaxiByFuelConsumption());
        System.out.println("\nThe find taxi by speed range: " + findTaxisBySpeedRange.get(0));
    }
}
