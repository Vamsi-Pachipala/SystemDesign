package DesignProblems.Elevator;

public class IdleState implements ElevatorState {
    @Override
    public void move(Elevator elevator) {

        // Idle
        if(elevator.hasRequests()) {
           elevator.processNextRequest();
        }
    }
}
