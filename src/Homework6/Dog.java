package Homework6;

public class Dog extends Animal {

    public static int DogCounter;

    public Dog(String id, int runDistance, int swimDistance) {
        super(id,runDistance,swimDistance);
        DogCounter++;
    }

}
