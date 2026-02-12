package LLD_Design_System.Parking_Lot.vehicle;

public abstract class Vehicle {

    private final String LicenceNumber;
    private final VehicleSize size;

    public Vehicle(String LiceneceNumber, VehicleSize size) {
        this.LicenceNumber = LiceneceNumber;
        this.size = size;

    }

    public String getLicenseNumber() {
        return LicenceNumber;
    }

    public VehicleSize getSize() {
        return size;
    }
}
