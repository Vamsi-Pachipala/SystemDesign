package DesignProblems.Elevator;

import java.util.TreeSet;

public class Elevator {

    String id;

    Direction direction;
    int currentFloor;

    ElevatorState currentState;

    Display display;

    private final TreeSet<Integer> requests = new TreeSet<>();

    public Elevator(String id, int currentFloor) {
        this.id = id;
        this.currentFloor = currentFloor;
        this.direction = Direction.IDLE;
        display = new Display();
        currentState = new IdleState();
    }

    void SetCurrentState(ElevatorState state) {
        this.currentState = state;
    }

    void addRequest(int floor) {
        requests.add(floor);
    }

    boolean hasRequests() {
        return !requests.isEmpty();
    }

    void processNextRequest() {

        if (requests.isEmpty()) {
            direction = Direction.IDLE;
            return;
        }

        int target = requests.first();

        if (currentFloor < target) {
            direction = Direction.UP;
            SetCurrentState(new MovingUpState());

        } else if (currentFloor > target) {
            direction = Direction.DOWN;
            SetCurrentState(new moveDown());

        } else {
            requests.remove(target);
            System.out.println(
                    "Elevator " + id +
                            " has arrived at floor " + currentFloor
            );

            SetCurrentState(new IdleState());
        }
    }

    void moveUp() {
        int target = requests.first();

        if (currentFloor < target) {
            currentFloor++;
            display.show(currentFloor, Direction.UP);
        }

        if (currentFloor == target) {
            requests.remove(target);
            System.out.println(
                    "Elevator " + id +
                            " has arrived at floor " + currentFloor
            );

            SetCurrentState(new IdleState());
        }
    }

    void moveDown() {
        int target = requests.first();

        if (currentFloor > target) {
            currentFloor--;
            display.show(currentFloor, Direction.DOWN);
        }

        if (currentFloor == target) {
            requests.remove(target);
            System.out.println(
                    "Elevator " + id +
                            " has arrived at floor " + currentFloor
            );

            SetCurrentState(new IdleState());
        }
    }

    public void move() {
        while (!requests.isEmpty()) {
            currentState.move(this);
        }

        direction = Direction.IDLE;
        SetCurrentState(new IdleState());
    }

    public void selectFloor(int target) {
        addRequest(target);
    }

}
