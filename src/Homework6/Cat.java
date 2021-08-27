package Homework6;

public class Cat extends Animal {

    public Cat() {
        super("Cat", 200, 0, 2);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cats don't swim.");
    }

}
