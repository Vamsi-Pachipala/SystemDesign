package ParkingLotDesign.Managers;

import ParkingLotDesign.VehicleType;

public class ParkingManagerFactory {
    public  ParkingManager getParkingManager(VehicleType type) {
        return switch (type) {
            case TWO_WHEELER -> new TwoWheelerParkingManager();
            //case FOUR_WHEELER -> new TwoFourParkingManager();
            default -> throw new IllegalArgumentException("Unknown vehicle type: " + type);
        };
    }
}

