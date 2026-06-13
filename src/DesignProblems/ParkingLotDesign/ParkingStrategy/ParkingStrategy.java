package DesignProblems.ParkingLotDesign.ParkingStrategy;

import DesignProblems.ParkingLotDesign.Managers.ParkingManager;
import DesignProblems.ParkingLotDesign.Vehicles.ParkingSpot;
import DesignProblems.ParkingLotDesign.Vehicles.Vehicle;

public interface ParkingStrategy {
    ParkingSpot allocateSpot(Vehicle vehicle, ParkingManager manager);
}