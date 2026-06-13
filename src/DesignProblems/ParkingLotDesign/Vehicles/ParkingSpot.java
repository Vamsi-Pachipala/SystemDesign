package DesignProblems.ParkingLotDesign.Vehicles;

import DesignProblems.ParkingLotDesign.VehicleType;

// Interface for parking spot
public interface ParkingSpot {
    boolean isAvailable();
    void parkVehicle(Vehicle vehicle);
    void vacateSpot();
    VehicleType getSpotType();
}
