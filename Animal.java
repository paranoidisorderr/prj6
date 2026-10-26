package lesson.animals;

public class Animal {
    public String food;
    public String location;

    public Animal() {

    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("noise made");
    }

    public void eat() {
        System.out.println(food + " was eating ");
    }

    public void sleep() {
        System.out.println(getClass().getSimpleName() + " is sleeping");
    }

    public String getFood() {
        return food;
    }

    void setFood(String food) {
        this.food = food;
    }

    String getLocation() {
        return location;
    }

    void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [food=" + food + ", location=" + location + "]";
    }
}