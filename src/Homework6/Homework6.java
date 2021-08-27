package Homework6;

public class Homework6 {

    public static void main(String[] args) {

        Animal[] animals = {
                new Dog("Джек", 400, 10),
                new Dog("Полкан", 600, 14),
                new Dog("Шарик", 300, 9),
                new Cat("Барсик", 200, 0),
                new Cat("Пушок", 200, 0),
        };

        for (int i = 0; i < animals.length; i++) {
            animals[i].run(200);
            animals[i].swim(14);
            Animal.AnimalCounter++;
            System.out.println("");
        }

        System.out.print("Всего собак: " + Dog.DogCounter);
        System.out.print(". Всего котов: " + Cat.CatCounter);
        System.out.println(". Всего животных: " + Animal.AnimalCounter);
    }

}
