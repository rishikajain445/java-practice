package Interview.Test2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ElevatorSystem {
    static class Elevator {
        int id;
        int currentFloor;
        String direction;
        Queue<Integer> targets = new LinkedList<>();

        Elevator(int id) {
            this.id = id;
            this.currentFloor = 1;
            this.direction = "Idle";
        }

        void addTarget(int floor) {
            if (!targets.contains(floor)) {
                targets.add(floor);
                updateDirection(floor);
            }
        }

        void updateDirection(int floor) {
            if (currentFloor < floor) {
                direction = "UP";
            } else if (currentFloor > floor) {
                direction = "DOWN";
            } else {
                direction = "IDLE";
            }
        }

        void moveStep() {
            if (targets.isEmpty()) {
                direction = "IDLE";
                System.out.println("Eleveator" + id + "in the idle floor");
                return;

            }
            if (direction.equals("UP")) {
                currentFloor = currentFloor + 2;
                if (currentFloor > 20)
                    currentFloor = 20;
                if (currentFloor >= targets.peek()) {
                    currentFloor = targets.poll();
                    arriveAtTarget();
                } else {
                    System.out.println("Eleveator" + id + "moving up -> floor" + currentFloor);

                }
            } else if (direction.equals("DOWN")) {
                currentFloor = currentFloor - 2;
                if (currentFloor < 1)
                    currentFloor = 1;

                if (currentFloor <= targets.poll()) {
                    currentFloor = targets.poll();
                    arriveAtTarget();
                } else {
                    System.out.println("Eleveator" + id + "moving down -> floor" + currentFloor);

                }
            } else {
                System.out.println("Eleveator" + id + "idle at floor" + currentFloor);
            }

        }

        void arriveAtTarget() {
            int target = targets.poll();
            System.out.println("Elevator " + id + "reached floor" + target);
            if (!targets.isEmpty()) {
                updateDirection(targets.peek());
            } else {
                direction = "IDLE";
                System.out.println("Elevator is idle at floor" + currentFloor);
            }
        }

    }

    static Elevator elevatorA = new Elevator(1);
    static Elevator elevatorB = new Elevator(2);



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Simulation started ");
        while (true) {
            System.out.println("Enter Command");
            System.out.println("1. Inside the elevator");
            System.out.println("2 . Floor Call ");
            System.out.println("3 . step simulation ");
            System.out.println("4 .Exit ");
            String input = sc.nextLine().toLowerCase();
            if (input.equals("Exit")) {
                break;
            }
            if (input.startsWith("inside")) {
                String[] parts = input.split(" ");
                int elevId = Integer.parseInt(parts[1]);
                int floor = Integer.parseInt(parts[2]);
                if (elevId == 1) {
                    elevatorA.addTarget(floor);
                } else {
                    elevatorB.addTarget(floor);
                }
                System.out.println("Inside Elevator");
            } else if (input.startsWith("call")) {
                String parts[] = input.split(" ");
                int floor = Integer.parseInt(parts[1]);
                String dir = parts[2];
                assignElevator(floor, dir);
            } else if (input.equals("step")) {
                elevatorA.moveStep();
                elevatorB.moveStep();
            }
        }
        }
        static  void assignElevator(int floor , String  dir)
        {
            int disA = Math.abs(elevatorA.currentFloor - floor);
            int disB = Math.abs (elevatorB.currentFloor - floor);
            Elevator chosen ;
            if(elevatorA.direction.equals("IDLE"))
            {
                chosen = elevatorA;
            }
            else if (elevatorB.direction.equals("IDLE"))
            {
                chosen = elevatorA;
            }
            else if (disA < disB)
            {
                chosen = elevatorA;
            }
            else{
                chosen = elevatorB;
            }
            chosen.addTarget(floor);
        }

}
