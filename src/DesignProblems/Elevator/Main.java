package DesignProblems.Elevator;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Elevator e1 = new Elevator("1", 1);
        Elevator e2 = new Elevator("2", 2);
        Elevator e3 = new Elevator("3", 3);

        Floor f1 = new Floor(1);
        Floor f2 = new Floor(2);
        Floor f3 = new Floor(3);

        ElevatorManager elevatorManager = new ElevatorManager(
                List.of(f1, f2 , f3),
                List.of(e1, e2, e3)
        );

        Elevator ele = elevatorManager.requestElevator(1, Direction.UP);
        System.out.println("Elevator " + ele.id + " has been assigned to the request.");
        ele.selectFloor(3);
        ele.move();


//        Elevator ele2 = elevatorManager.requestElevator(2, Direction.DOWN);
//        System.out.println("Elevator " + ele2.id + " has been assigned to the request.");
//        ele2.selectFloor(1);
//        ele2.move();
//
//        ele.selectFloor(1);
//        ele.selectFloor(2);
//        ele.selectFloor(3);
//
//        ele.move();
    }
}
