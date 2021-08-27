package Homework6;

public abstract class Animal {

    private final String id;
    private final int runDistance;
    private final int swimDistance;
    private final float jumpHeight;

    public Animal(String id, int runDistance, int swimDistance, float jumpHeight) {
        this.id = id;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        this.jumpHeight = jumpHeight;
    }

    public void run(int distance) {
        if (distance <= runDistance) {
            System.out.println(id + ": run " + distance + " metres.");
        } else {
            System.out.println(id + ": couldn't run " + distance + " metres.");
        }
    }

    public void swim(int distance) {
        if (distance <= swimDistance) {
            System.out.println(" swam " + distance + " metres.");
        } else {
            System.out.println(" couldn't swam " + distance + " metres.");
        }
    }

    public void jumpOver(float distance) {
        if (distance <= jumpHeight) {
            System.out.println(" jumped " + distance + " metres high.");
        } else {
            System.out.println(" couldn't jump " + distance + " metres high.");
        }
    }

}
