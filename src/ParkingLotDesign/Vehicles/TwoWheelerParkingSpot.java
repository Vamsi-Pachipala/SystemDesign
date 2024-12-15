package ParkingLotDesign.Vehicles;

import ParkingLotDesign.VehicleType;

public class TwoWheelerParkingSpot implements ParkingSpot {

    private boolean isAvailable = true;
    private Vehicle parkedVehicle;
    public TwoWheelerParkingSpot() {

    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public void parkVehicle(Vehicle vehicle) {
        this.isAvailable = false;
        this.parkedVehicle = vehicle;
    }

    @Override
    public void vacateSpot() {
        this.isAvailable = false;
        this.parkedVehicle = null;
    }

    @Override
    public VehicleType getSpotType() {
        return VehicleType.TWO_WHEELER;
    }
}
