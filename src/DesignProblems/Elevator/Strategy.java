package DesignProblems.Elevator;

import java.util.List;

public class Strategy {
    public Elevator selectElevator(List<Elevator> elevators, int requestedFloor, Direction requestedDirection) {
        Elevator selectedElevator = null;
        int minDistance = Integer.MAX_VALUE;

        for (Elevator elevator : elevators) {
            if (elevator.direction == Direction.IDLE || elevator.direction == requestedDirection) {
                int distance = Math.abs(elevator.currentFloor - requestedFloor);
                if (distance < minDistance) {
                    minDistance = distance;
                    selectedElevator = elevator;
                }
            }
        }

        return selectedElevator;
    }
}
