package LLD_Design_System.Parking_Lot.strategy.fee;

import java.util.Map;
import java.util.EnumMap;
import LLD_Design_System.Parking_Lot.entities.ParkingTicket;
import LLD_Design_System.Parking_Lot.vehicle.VehicleSize;

public class VehicleBasedFeeStrategy implements FeeStrategy {

    // Using EnumMap is more memory-efficient for enum keys
    private static final Map<VehicleSize, Double> HOURLY_RATES = new EnumMap<>(VehicleSize.class);

    static {
        HOURLY_RATES.put(VehicleSize.SMALL, 10.0);
        HOURLY_RATES.put(VehicleSize.MEDIUM, 20.0);
        HOURLY_RATES.put(VehicleSize.LARGE, 30.0);
    }

    @Override
    public double calculateFee(ParkingTicket ticket) {
        if (ticket == null || ticket.getVehicle() == null) {
            return 0.0;
        }

        long durationMillis = ticket.getExitTimestamp() - ticket.getEntryTimestamp();

        // Convert to hours and round up to the nearest whole hour
        double hours = Math.ceil(durationMillis / (1000.0 * 60 * 60));

        // Handle potential missing keys gracefully
        double rate = HOURLY_RATES.getOrDefault(ticket.getVehicle().getSize(), 50.0);

        return hours * rate;
    }
}