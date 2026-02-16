package LLD_Design_System.Parking_Lot.strategy.fee;

import LLD_Design_System.Parking_Lot.entities.ParkingTicket;

public interface FeeStrategy {

    double calculateFee(ParkingTicket parkingTicket);
}
