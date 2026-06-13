package DesignProblems.ParkingLotDesign.ParkingStrategy;

import DesignProblems.ParkingLotDesign.Managers.ParkingManager;
import DesignProblems.ParkingLotDesign.Vehicles.ParkingSpot;
import DesignProblems.ParkingLotDesign.Vehicles.Vehicle;

public class DefaultParkingStrategy implements ParkingStrategy {
    @Override
    public ParkingSpot allocateSpot(Vehicle vehicle, ParkingManager manager) {
        return manager.findParkingSpot(vehicle);
    }
}
