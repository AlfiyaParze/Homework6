package Homework6;

public class Homework6 {

    public static void main(String[] args) {

        Animal[] animals = {new Dog(), new DogSecond(), new Cat()};
        for (int i = 0; i < animals.length; i++) {
            System.out.println("");
            animals[i].run(200);
            animals[i].swim(14);
            animals[i].jumpOver(1);
        }
    }

}
