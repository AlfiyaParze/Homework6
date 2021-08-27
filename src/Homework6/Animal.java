package Homework6;

public abstract class Animal {

    private final String id;
    private final int runDistance;
    private final int swimDistance;

    public Animal(String id, int runDistance, int swimDistance) {
        this.id = id;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }

    public void run(int distance) {
        if (distance <= runDistance) {
            System.out.print(id + ": пробежал " + distance + " метров;");
        } else {
            System.out.print(id + ": не пробежал " + distance + " метров;");
        }
    }

    public void swim(int distance) {
        if (distance <= swimDistance) {
            System.out.println(" проплыл " + distance + " метров.");
        } else {
            System.out.println(" не смог проплыть " + distance + " метров.");
        }
    }

    public static int AnimalCounter;



}
