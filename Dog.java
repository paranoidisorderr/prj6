package lesson.animals;

public class Dog extends Animal {
    private String breed;

    public Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("bark");
    }

    @Override
    public void eat() {
        System.out.println("eating " + food);
    }

    @Override
    public String toString() {
        System.out.println("Dog [food=" + getFood() + ", location=" + getLocation() + ", breed=" + breed + "]\"");
    }

    public String getBread() {
        return breed;
    }

    public void setBread(String bread) {
        this.breed = bread;
    }
}
