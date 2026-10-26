package lesson.animals;

public class Horse extends Animal {
    int maxSpeed;

    public void Horse(String food, String location, int maxSpeed) {
        super(food, location);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void makeNoise() {
        System.out.println("neigh");
    }

    @Override
    public void eat() {
        System.out.println("eating " + food);
    }

    @Override
    public String toString() {
        return "Horse [food=" + getFood() + ", location=" + getLocation() + ", maxSpeed=" + maxSpeed + "]";
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}