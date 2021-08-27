package Homework6;

public class Cat extends Animal {

    public static int CatCounter;

    public Cat(String id, int runDistance, int swimDistance) {
        super(id,runDistance,swimDistance);
        CatCounter++;
    }

    @Override
    public void swim(int distance) {
        System.out.println(" коты не плавают.");
    }

}
