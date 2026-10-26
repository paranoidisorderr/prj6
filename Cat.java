package lesson.animals;

public class Cat extends Animal{
    private Boolean isIndoor;

    public void Cat(String food, String location, String isIndoore) {
        super(food, location);
        this.isIndoor = isIndoor;
    }

    @Override
    public void makeNoise() {
        System.out.println("meow");
    }

    @Override
    public void eat() {
        System.out.println("eating " + food);
    }

    @Override
    public String toString() {
        return "Cat [food=" + getFood() + ", location=" + getLocation() + ", isIndoor=" + isIndoor + "]";
    }

    public Boolean getIndoor() {
        return isIndoor;
    }

    public void setIndoor(Boolean indoor) {
        isIndoor = indoor;
    }

}
