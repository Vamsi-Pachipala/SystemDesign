package DesignProblems.ParkingLotDesign;

import DesignProblems.ParkingLotDesign.EntranceGate.EntranceGate;
import DesignProblems.ParkingLotDesign.ExitGate.ExitGate;
import DesignProblems.ParkingLotDesign.Managers.ParkingManager;
import DesignProblems.ParkingLotDesign.Managers.ParkingManagerFactory;
import DesignProblems.ParkingLotDesign.ParkingStrategy.DefaultParkingStrategy;
import DesignProblems.ParkingLotDesign.ParkingStrategy.ParkingStrategy;
import DesignProblems.ParkingLotDesign.Vehicles.TwoWheelerParkingSpot;
import DesignProblems.ParkingLotDesign.Vehicles.Vehicle;

public class Client {
    public static void main(String[] args) {
        // Create parking manager factory and strategy
        ParkingManagerFactory factory = new ParkingManagerFactory();
        ParkingStrategy strategy = new DefaultParkingStrategy();

        // Create entrance
        EntranceGate entranceGate = new EntranceGate(strategy);

        // Set up parking managers and add parking spots
        ParkingManager twoWheelerManager = factory.getParkingManager(VehicleType.TWO_WHEELER);

        // Add parking spots
        for (int i = 0; i < 5; i++) {
            twoWheelerManager.addParkingSpot(new TwoWheelerParkingSpot());
        }

        // Simulate vehicle entry
        System.out.println("=== Vehicle Entry ===");
        Vehicle bike = new Vehicle("BIKE123", VehicleType.TWO_WHEELER);

        Ticket bikeTicket = entranceGate.generateTicket(bike , twoWheelerManager);

        if (bikeTicket != null) {
            System.out.println("Bike parked with Ticket ID: " + bikeTicket.getTicketId());
            System.out.println("vehicle number is "+bikeTicket.getVehicle().getLicensePlate());
            System.out.println("vehicle name is "+bikeTicket.getVehicle().getType());
        }

        // Wait to simulate parking duration
        try {
            Thread.sleep(3000); // Simulate 3 seconds (or adjust to hours in real-world scenarios)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Simulate vehicle exit
        ExitGate exitGate = new ExitGate();

        System.out.println("\n=== Vehicle Exit ===");
        if (bikeTicket != null) {
            System.out.println("Bike exiting...");
            exitGate.processExit(bikeTicket, 10.0); // $10 per hour rate for bikes
        }
    }
}

