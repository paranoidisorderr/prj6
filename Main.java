package lesson.animals;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Dog("Meat", "Yard", "Shepherd"),
                new Dog("Kibble", "Apartment", "Dachshund"),
                new Cat("Fish", "Home", true),
                new Cat("Mouse", "Street", false),
                new Horse("Hay", "Stable", 60),
                new Horse("Oats", "Field", 45),
                new Parrot("Grain", "Cage", 30),
                new Parrot("Fruit", "Apartment", 120)
        };

        Veterinarian vet = new Veterinarian();

        for (int i = 0; i < animals.length; i++) {
            Animal animal = animals[i];
            System.out.println("Animal " + (i + 1));
            animal.makeNoise();
            animal.eat();
            animal.sleep();
            vet.treatAnimal(animal);
            vet.examine(animal);
            System.out.println(animal.toString());
            System.out.println();
        }

        int dogs = 0;
        int cats = 0;
        int horses = 0;
        int parrots = 0;

        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                dogs++;
            } else if (animal instanceof Cat) {
                cats++;
            } else if (animal instanceof Horse) {
                horses++;
            } else if (animal instanceof Parrot) {
                parrots++;
            }
        }

        System.out.println("Dogs: " + dogs);
        System.out.println("Cats: " + cats);
        System.out.println("Horses: " + horses);
        System.out.println("Parrots: " + parrots);
    }
}