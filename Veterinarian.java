package lesson.animals;

public class Veterinarian {
    public static final String CLINIC_NAME = "Good Doctor";

    public void treatAnimal(Animal animal) {
        System.out.println("food = " + animal.getFood() + ", location = " + animal.getLocation());
    }

    public void examine(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            System.out.println("Breed: " + dog.getBread());
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            System.out.println("Indoor: " + cat.isIndoor);
        } else if (animal instanceof Horse) {
            Horse horse = (Horse) animal;
            System.out.println("Max speed: " + horse.getMaxSpeed() + " km/h");
        } else if (animal instanceof Parrot) {
            Parrot parrot = (Parrot) animal;
            System.out.println("Vocabulary size: " + parrot.getVocabularySize() + " words");
        } else {
            System.out.println("Unknown animal");
        }
    }
}