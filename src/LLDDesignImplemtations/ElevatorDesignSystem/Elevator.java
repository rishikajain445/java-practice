package LLDDesignImplemtations.ElevatorDesignSystem;

import java.util.LinkedList;
import java.util.Queue;

public class Elevator {

    int id;
    int currentFloor;
    String direction;
    boolean doorOpens;
    Queue<Integer> targets;

    Elevator(int id)
    {
        this.id =id;
        this.currentFloor= 1;
        this.direction = "IDLE";
        this.doorOpens = false;
        this.targets = new LinkedList<>();
    }
    public void callFromOutside(int floor , String direction)
    {
        System.out.println("Floor" + floor +" requested from outside moving in " +direction +"direction");
        addTarget(floor);
        moveToTarget();
    }
    public void addTarget(int floor)
    {
        if(!targets.contains(floor))
        {
            targets.add(floor);
            System.out.println("Floor "+floor +"is added in queue");
        }
    }
    void doorOpen()
    {
        this.doorOpens = true;
        System.out.println("Door has opened");
    }
    void doorClosed()
    {
        this.doorOpens = false;
        System.out.println("Door has closed");
       // processTargets();
    }

    public void moveToTarget()
    {

    }
}
