package DesignProblems.Elevator;

import java.util.List;

public class ElevatorManager {

    List<Floor> floors;

    List<Elevator> elevators;

    public ElevatorManager(List<Floor> floors, List<Elevator> elevators) {
        this.floors = floors;
        this.elevators = elevators;
    }

    public Elevator requestElevator(int requestedFloor, Direction requestedDirection) {
        Strategy strategy = new Strategy();
        Elevator selectedElevator = strategy.selectElevator(elevators, requestedFloor, requestedDirection);
        if (selectedElevator != null) {
            return selectedElevator;
        } else {
            return null;
        }
    }
}
